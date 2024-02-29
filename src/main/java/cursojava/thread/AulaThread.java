package cursojava.thread;

import javax.swing.*;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {

        /*Thread processando em paralelo*/
        Thread threadEmail = new Thread(thread1);
        threadEmail.start();

        //==============================Divisão das Threads==============================

        Thread threadNotaFiscal = new Thread(thread2);
        threadNotaFiscal.start();

        System.out.println("Chegou ao fim da thread!");
        JOptionPane.showMessageDialog(null,"Mensagem exucutando pro usuario");

    }

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos++){

                System.out.println("Executando uma rotina de envio de email");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos++){

                System.out.println("Executando uma rotina de nota fiscal");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };
}
