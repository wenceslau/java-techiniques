package br.com.ada.lambda.intefaces;

import br.com.ada.lambda.abstracts.Macaco;
import br.com.ada.lambda.abstracts.Mamifero;

public class Main {

    public static void main(String[] args) {

        MathOperations multiply = new Multiply();
        System.out.println(multiply.operation(2,2));

        MathOperations divid = new Divid();
        System.out.println(divid.operation(2,2));

        MathOperations sum = new Sum();
        System.out.println(sum.operation(2,4));

        MathOperations subtract = new Subtract();
        System.out.println(subtract.operation(5,4));

    }

}
