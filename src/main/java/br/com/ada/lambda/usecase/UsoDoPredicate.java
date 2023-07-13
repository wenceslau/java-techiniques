package br.com.ada.lambda.usecase;

import java.util.ArrayList;
import java.util.List;

public class UsoDoPredicate {

    public static void main(String[] args) {
        // lista de animais
        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("peixe", false, true));
        animais.add(new Animal("canguru", true, false));
        animais.add(new Animal("coelho", true, false));
        animais.add(new Animal("tartaruga", false, true));

        imprimir(animais, a -> a.podeNadar() );
        imprimir(animais, a -> a.podeSaltar() );
    }

    public static void imprimir(List<Animal> animais, VerificadorLambda<Animal> verificadorLambda){
        for (Animal animal : animais) {
            // verificando
            if (verificadorLambda.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
