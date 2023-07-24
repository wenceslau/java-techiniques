package br.com.ada.exercicios;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    /*

    3.	Escreva um programa que use o método Stream.iterate() para criar um
    fluxo dos primeiros 10 números de Fibonacci e,
    em seguida, use o método forEach() para imprimir cada elemento do fluxo.

     */

    public static void main(String[] args) {
        Stream<Integer> stream =  Stream.iterate(new int[]{0,1}, n -> new int[] { n[1], n[0] + n[1]})
                .limit(15)
                .map( n -> n[0]);
        stream.forEach(System.out::println);
    }
}
