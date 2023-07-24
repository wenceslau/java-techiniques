package br.com.ada.threads;

public class Corrida {


    public static void main(String[] args) throws InterruptedException {

        Equipe equipeA = new Equipe("Equipe A");
        Equipe equipeB = new Equipe("Equipe B");

        equipeA.start();
        equipeB.start();

        while (equipeA.isAlive() && equipeB.isAlive()){
            if  (!equipeA.isAlive() && !equipeB.isAlive()) {
                System.out.println("Empate");
            }else if (!equipeB.isAlive()){
                System.out.println("Equipe B venceu!");
            }else if (!equipeA.isAlive()) {
                System.out.println("Equipe A venceu!");
            }
            Thread.sleep(150);
        }


    }
}
