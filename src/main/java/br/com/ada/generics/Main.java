package br.com.ada.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    Crie uma classe genérica chamada ListaGenerica que pode armazenar
    uma lista de elementos de qualquer tipo. A classe deve ter métodos para
    adicionar elementos, remover elementos e exibir a lista.
     */
    public static void main(String[] args) {

        Caixa caixa = new Caixa();

        Integer numero = 10;
        caixa.colocar(numero);

        String text = "";
        caixa.colocar(text);

        List<String> list = new ArrayList<>();


    }

}
