package br.com.ada.generics;

public class Caixa<T> {

    private T objeto;

    public void colocar(T objeto){
        this.objeto = objeto;
    }

    public void remover(){
        objeto = null;
    }

}
