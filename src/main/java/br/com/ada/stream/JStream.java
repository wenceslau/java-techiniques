package br.com.ada.stream;

import java.sql.Struct;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JStream {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double media = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Média dos Números: " + media);

        List<Integer> quadrados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        int somaQuadrados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .reduce(0,Integer::sum);

        System.out.println(quadrados);
        System.out.println(somaQuadrados);

        lambda();
        tradicional();
    }

    private static void referenciaMetodo(){

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        numeros.forEach(n -> System.out.println(n));


        int soma = numeros.stream()
                .reduce(0,Integer::sum);

        List<String> palavras = Arrays.asList("A","B","C");

        String concat = palavras.stream().reduce("",String::concat);

    }

    private static void lambda(){
        List<String> frutas = new ArrayList<>();
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Abacate");
        frutas.add("Uva");
        frutas.add("Blueberry");

        Set<Integer> sets = new HashSet<>();
        sets.stream();

        List<String> frutasB = frutas.stream()
                .filter(f -> f.startsWith("B"))
                .collect(Collectors.toList());

        String fruta = frutas.stream()
                .filter(f -> f.equals("Maça"))
                .findAny().get();

        System.out.println(frutasB);
    }

    private static void tradicional() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Abacate");
        frutas.add("Uva");
        frutas.add("Blueberry");

        List<String> frutasB = new ArrayList<>();
        for (String fruta : frutas) {
            if (fruta.toUpperCase().startsWith("B")){
                frutasB.add(fruta);
            }
        }
        System.out.println(frutasB);
    }
}
