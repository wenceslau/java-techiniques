package br.com.ada.lambda.intefaces;

public class Divid implements MathOperations {
    @Override
    public int operation(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divid by is not allowed");
        }
        return a / b;
    }
}
