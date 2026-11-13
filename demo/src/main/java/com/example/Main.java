package com.example;

public class Main {

    public static class TicTac extends Thread {
        private String mensaje;

        public TicTac (String mensaje){
            this.mensaje = mensaje;
        }

        public void run(){
            while (true) {
                try {
                    System.out.println(mensaje);
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static void main(String[] args) {
        TicTac tic = new TicTac("tic");
        TicTac tac = new TicTac("tac");

        tic.start();

        try {
            tic.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        tac.start();
    }
}