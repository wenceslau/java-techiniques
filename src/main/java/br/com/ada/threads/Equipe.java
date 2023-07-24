package br.com.ada.threads;

public class Equipe extends Thread {

    private String name;

    public Equipe(String name){
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Equipe "+name+" avançou  " + i +" metros");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Equipe " + name + " terminou a corrida");


    }
}
