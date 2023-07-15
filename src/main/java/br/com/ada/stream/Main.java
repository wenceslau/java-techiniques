package br.com.ada.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        /*
        12/07 – Programação Funcional.
        > Revisão rapida aula anterior
        > Revisão de Interface
        > Lambdas e Interfaces Funcional

        14/07 – Streams parte 1.
        > Revisão rapida da aula anterior
        > Revisão de conceitos de collections
        > Streams com coleções

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

       // EXEMPLOS DE TIPOS DE PROGRAMAÇÃO FUNCIONAL

        //Expressões Lambda,
        Function<Integer, Integer> quadrado = (x) -> x * x;

        //Interfaces Funcionais,
        Function<Integer, Integer> suma = (x) -> x + x;
        BiFunction<String, String, String> concat = (a, b) -> a +" "+ b;
        Predicate<Integer> ehImpar = (number) -> number % 2 == 0;

        //Referências a Métodos
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.forEach(System.out::println);

        //Stream API: A API
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5);
        int soma = numeros2.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();

        //Imutabilidade
        //Funções de Ordem Superior
        //Funções Puras
    }

}
