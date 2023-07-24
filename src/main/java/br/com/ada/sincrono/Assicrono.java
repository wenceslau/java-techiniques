package br.com.ada.sincrono;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Assicrono {

    public static CompletableFuture<String> buscaDadosApi1(){
        return CompletableFuture.supplyAsync(() -> {
            //uma consulta na api 1
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
            }
            return "Resultado API 1";
        });
    }

    public static CompletableFuture<String> buscaDadosApi2(){
        return CompletableFuture.supplyAsync(() -> {
            //uma consulta na api 2
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            return "Resultado API 2";
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> retornoApi1 = buscaDadosApi1();
        CompletableFuture<String> retornoApi2 = buscaDadosApi2();

        System.out.println("Res 2 " + retornoApi2.get());
        System.out.println("Res 1 " + retornoApi1.get());

        CompletableFuture<String> resultadoFinal = retornoApi1.thenCombine(
                retornoApi2, (resul1, resul2) -> resul1 + " - " + resul2);

        System.out.println("Res final " + resultadoFinal.get());


    }

}
