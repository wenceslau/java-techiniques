package br.com.ada.lambda.usecase;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {


    public static void main(String[] args) {

        // lista de animais
        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("peixe", false, true));
        animais.add(new Animal("canguru", true, false));
        animais.add(new Animal("coelho", true, false));
        animais.add(new Animal("tartaruga", false, true));

        // imprime os animais verificados
        System.out.println("Animais que pode saltar");
        imprimir(animais, new VerificaSeEhSaltador());

        System.out.println("Animais que pode nadar");
        imprimir(animais, new VerificaSeEhNadador());

    }
    private static void imprimir(List<Animal> animais, Verificador verificador) {
        for (Animal animal : animais) {
            // verificando
            if (verificador.verificar(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
