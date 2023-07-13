package br.com.ada.lambda.usecase;

public class VerificaSeEhSaltador implements Verificador{

    @Override
    public boolean verificar(Animal a) {
        return a.podeSaltar();
    }
}