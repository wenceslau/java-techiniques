package br.com.ada.threads;

import java.security.spec.ECField;
import java.time.LocalDateTime;
import java.util.Timer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Inicio do metodo");

        Runnable runnable = new JRunnable();
        Thread thread = new Thread(runnable);
        //thread.setDaemon(true);
        thread.start();
        Thread.sleep(2000);

        //thread.start(); - Inicia a Thread de forma paralela
        //thread.run(); - Executa a thread, mas não de forma paralela.
        //thread.isAlive() - Informa se a thread esta em execução
        //thread.getState();



        System.out.println("fim do metodo");
    }


    public static void exemplo2(){
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("i: " + i);
                        }
                    }
                }
        ).start();
    }

    public static void exemplo3(){

        Thread thread = new Thread( () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("i: " + i);
            }
        });
        thread.start();

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("i: " + i);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Runnable runnable1 = () -> executar();
        Thread thread2 = new Thread(runnable1);
        thread2.start();
    }

    public static void executar(){
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
    }

    public void exemplo4(){
        Runnable runnable1 = () -> executar();
        Thread thread2 = new Thread(runnable1);
        thread2.start();
    }
    public void executar2(){
        System.out.println(LocalDateTime.now());
    }

}
