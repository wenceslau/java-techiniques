package br.com.ada.optional;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);

        int num = numbers.stream()
                .filter(x->x == 3)
                .findFirst().orElse(-1);

        Optional<Integer> optNum = numbers.stream()
                .filter(x->x== 22)
                .findAny();

        if (optNum.isPresent()){
            num = optNum.get();
        }

        String text = "texto";
        text.indexOf('a');

        optNum.get();
        optNum.orElse(-1);
        optNum.orElseGet(() -> {
                //excreve log;
                return -1;
        });
        optNum.orElseThrow(() -> new RuntimeException("Não foi encontrado nenhum com o valor informado"));

        OptionalDouble od;
        OptionalInt oi;
        OptionalLong ol;

        OptionalDouble optAv = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    public static int executaAcao(){

        //gravando no log...

        return -1;

    }

    private static void revisao(){

        Optional<String> optional = Optional.of("value");

        optional.isPresent();
        optional.isEmpty();
        optional.get();
        optional.orElse("outro valor");
        optional.orElseGet(() -> "a" + "b");
        optional.orElseThrow(() -> new RuntimeException(""));
        optional.orElseThrow();

        List<String> list = List.of("Agua", "Terra", "Fogo");

        String value = list.stream()
                .filter(s -> s.equalsIgnoreCase("agua"))
                .findFirst()
                .get();

        Predicate<String> igual = (s -> s.equalsIgnoreCase("agua"));
        value = list.stream()
                .filter(igual)
                .findFirst()
                .get();

        String palavra = "";

        if (palavra.equalsIgnoreCase("agua")){

        }

    }

    public void testaDivisao(){

        List<String> list = List.of("gua", "Terra", "Fogo");

        Optional<String > valor = list.stream()
                .filter(s-> s.equalsIgnoreCase("agua"))
                .findFirst();

        if (valor.isPresent()){
            System.out.println(valor.get());
        }

        Optional<Double> resultado = dividir(1, 0);

       if (resultado.isPresent()){
           System.out.println(resultado.get());
       }else{
           System.out.println("não foi realizar a divisão");
       }

    }

    private static Optional<Double> dividir(double valor1, double valor2)  {
        if (valor2 == 0){
           return Optional.empty();
        }
        return Optional.of( valor1 / valor2);
    }
}
