package br.com.ada.files;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*

        17/07 – Streams parte 2.
        > Revisão rapida da aula anterior
        > Revisão da API de arquivos do Java
        > Stream com arquivos

        19/07 – Interface Optional e Predicate.
        > Revisão rapida da aula anterior
        > Optional e Predicate
        > Exercicios ou Revisão de algum assunto.

        21/07 – Programação Paralela e assíncrona, e revisao de todo conteudo
        24/07 – Trabalho Final
        26/07 – Correcao Trabalho Final e as Rubricas

 */

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 5, 1);
        List<String> palavras = Arrays.asList("Agua","Borboleta","Carro");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        numeros.forEach(n -> System.out.println(n));

        int soma = numeros.stream()
                .reduce(0,Integer::sum);

        String concat = palavras.stream()
                .reduce("",String::concat);

        List<String> palavrasB = palavras.stream()
                .filter(x -> x.startsWith("B"))
                .collect(Collectors.toList());

        List<String> uppercaseStrings = palavras.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());

        double avarage = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        String longestString = palavras.stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        List<Integer> uniqueNumbers = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

    }

}
