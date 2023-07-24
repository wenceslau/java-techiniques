package br.com.ada.threads;

public class JRunnableB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("JRB i: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }
}
