package com.example;

import java.io.*;

public class Quasibash {
    public static void main(String[] args) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce comando");

        try {
            String comando = teclado.readLine();
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(comando);
        } catch (Exception e) {
            System.out.println("Error al ejecutar el comando");
            e.printStackTrace();
        }
    }

}
