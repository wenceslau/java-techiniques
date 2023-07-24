package br.com.ada.files;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

    Nome, Cidade, Estado Civil, Data Nascimento


    Joao Carlos;São Paulo;casado;22/01/2002
    Ana Catarina;Rio de Janeiro;solteiro;16/10/2001
    Luciana Santos;Curitiba;casado;22/10/1995
    Marcos Paulo;São Paulo;casada;01/04/1998
    Mariana Tavares;Recife;solteira;10/02/1998


    todos que fazem aniversario em outubro
    todos que são casados
    Todos que são Recife


        19/07 – Interface Optional e Predicate.
        > Revisão rapida da aula anterior
        > Optional e Predicate
        > Exercicios ou Revisão de algum assunto.

 */
public class JStream {

    public static void main(String[] args) throws IOException {

        createFile();

        System.out.println("TODOS EMPREGADOS");
        List<Employee> empregados = getEmployees();
        System.out.println(empregados);

        System.out.println("ANIVERSARIANTES DE OUTUBRO");
        List<Employee> aniversariantesOutubro = getAniversariantesOutubro(empregados);
        System.out.println(aniversariantesOutubro);

        System.out.println("CASADOS(AS)");
        List<Employee> casados = getCasados(empregados);
        System.out.println(casados);

        System.out.println("PERNAMBUCANO");
        List<Employee> pernambucano = getPernambucano(empregados);
        System.out.println(pernambucano);

        System.out.println("MAIS VELHO(A)");
        Employee maisVelho = getMaisVelho(empregados);
        System.out.println(maisVelho);

        System.out.println("BUSCA POR NOME");
        Employee empregado = getByName("Wenceslau",   empregados);
        System.out.println(empregado);

        Predicate<Employee> filtroPorCidade = e -> e.getCity().equalsIgnoreCase("Recife");
        Employee emp = filtrar(filtroPorCidade, empregados);

        Predicate<Employee> filtroEhCasado = e->e.isMarriage();
        Employee emp1 = filtrar(filtroEhCasado, empregados);

        List<Object> listas = List.of("AAAA", "BBBB", "CCCC");

        Predicate<Object> filtroGeneric =  x-> testar(x, "A");

        Object pal = filtrarGeneric(filtroGeneric, listas);

        Optional<Double> opt = Optional.of(10.0);
        opt.orElse(9.0);

        Predicate<Integer> ehImpar = (n -> n % 2 != 0);

        boolean ehImp =  ehImpar.test(2);
        boolean ehImp1 =  ehImpar.test(7);

        Predicate<String> isVazio = s ->  s.isEmpty();

        String palavra = "";
        boolean estaVazia = isVazio.equals(palavra);

    }

    public static boolean testar(Object o, String valor){
        boolean result;
        if (o instanceof String){
            String vlr = (String) o;
            return vlr.contains(valor);
        }
        return false;
    }

    private static Object filtrarGeneric(Predicate<Object> predicate, List<Object> lista) {
        Optional<Object> optEmployee =  lista.stream()
                .filter(predicate)
                .findFirst();

        if (optEmployee.isPresent()){
            return optEmployee.get();
        }
        return null;
    }

    private static Employee getByName(String name, List<Employee> empregados) {
        Optional<Employee> optEmployee =  empregados.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .findFirst();

        if (optEmployee.isPresent()){
            return optEmployee.get();
        }
        return null;
    }

    private static Employee filtrar(Predicate<Employee> predicate, List<Employee> empregados) {
        Optional<Employee> optEmployee =  empregados.stream()
                .filter(predicate)
                .findFirst();

        if (optEmployee.isPresent()){
            return optEmployee.get();
        }
        return null;
    }

    private static void printAllEmployeUsingFor() throws IOException {
        List<String> linhas =  Files.readAllLines(Path.of("rh.txt"));
        List<Employee> empregados = new ArrayList<>();
        //Joao Carlos;São Paulo;casado;22/01/2002
        for (String linha : linhas) {
            Employee empregado = parseEmployee(linha);
            empregados.add(empregado);
        }
    }

    private static Employee getMaisVelho(List<Employee> empregados) {
        return empregados.stream()
                .min(Comparator.comparing(Employee::getBirthday))
                .get();
    }

    private static List<Employee> getPernambucano(List<Employee> empregados) {
        return empregados.stream()
                .filter(e -> e.getCity().equalsIgnoreCase("Recife"))
                .collect(Collectors.toList());
    }

    private static List<Employee> getCasados(List<Employee> empregados) {
        List<Employee> casados = empregados.stream()
                .filter(e-> e.isMarriage())
                .collect(Collectors.toList());
        return casados;
    }

    private static List<Employee> getAniversariantesOutubro(List<Employee> empregados) {
        List<Employee> aniversariantesOutubro  = empregados.stream()
                .filter(e -> e.getBirthday().getMonth().equals(Month.OCTOBER))
                .collect(Collectors.toList());
        return aniversariantesOutubro;
    }

    private static List<Employee> getEmployees() throws IOException {
        Stream<String> linhasStream = Files.lines(Path.of("rh.txt"));
        List<Employee>  empregadosStream = linhasStream
                .map(e -> parseEmployee(e))
                .collect(Collectors.toList());
        return empregadosStream;
    }

    public static Employee parseEmployee(String linha){
        String[] array = linha.split(";");
        boolean casado = parseMarriage(array[2]);
        LocalDate dataNasc = convertDate(array[3]);
        Employee empregado = new Employee(array[0],array[1],casado,dataNasc);
        return empregado;
    }

    public static LocalDate convertDate(String valor){
        return LocalDate.parse(valor, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static boolean parseMarriage(String valor){

        if (valor.equalsIgnoreCase("casado")
                || valor.equalsIgnoreCase("casada")){
            return true;
        }
        return false;

    }

    public static void createFile() throws IOException {
        File arquivo = new File("rh.txt");
        arquivo.createNewFile();

        FileWriter fileWriter = new FileWriter(arquivo, true);
        fileWriter.write("Joao Carlos;São Paulo;casado;22/01/2002\n");
        fileWriter.write("Ana Catarina;Rio de Janeiro;solteiro;16/10/2001\n");
        fileWriter.write("Luciana Santos;Curitiba;casado;22/10/1995\n");
        fileWriter.write("Marcos Paulo;São Paulo;casada;01/04/1998\n");
        fileWriter.write("Mariana Tavares;Recife;solteira;10/02/1998\n");

        fileWriter.close();
    }

}
