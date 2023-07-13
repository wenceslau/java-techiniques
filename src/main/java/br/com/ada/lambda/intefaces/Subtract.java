package br.com.ada.lambda.intefaces;

public class Subtract implements MathOperations {

    @Override
    public int operation(int a, int b) {
        return a - b;
    }
}
