package br.com.ada.lambda.usecase;

public class VerificaSeEhNadador implements Verificador {

    @Override
    public boolean verificar(Animal a) {
        return a.podeNadar();
    }
}
