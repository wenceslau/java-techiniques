package br.com.ada.lambda.intefaces;

public class Multiply implements MathOperations {
    @Override
    public int operation(int a, int b) {
        return a * b;
    }
}
