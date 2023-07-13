package br.com.ada.lambda;

import br.com.ada.lambda.intefaces.MathOperations;
import br.com.ada.lambda.intefaces.Multiply;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {


    public static void main(String[] args) {

        Function<Integer,Integer> quadrada = (x) -> x * x;
        Function<String,Integer> size = (x) -> x.length();
        Function<String,String> upper = (x) -> x.toUpperCase();

        System.out.println(upper.apply ("valor"));

        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> sub = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> mult = (x, y) -> x * y;
        BiFunction<Integer, Integer, Integer> div = (x, y) -> x / y;

        BiFunction<String, String, String> concat = (x, y) -> x +" - "+ y;
        System.out.println(concat.apply ("filho", "Mae"));

        MathOperations multiply = new Multiply();
        System.out.println(multiply.operation(2,2));
        MathOperations sum1 = (a,b) -> a + b;
        MathOperations sqrt = (a,b) -> (( a + b ) * 2 );
        MathOperations mult1 = (a,b) -> a + b;
        MathOperations divid = (a,b) -> a / b;

        System.out.println(sum1.operation(1,2));
        System.out.println(sqrt.operation(1,2));

    }

}
