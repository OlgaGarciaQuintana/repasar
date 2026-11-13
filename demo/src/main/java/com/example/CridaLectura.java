package com.example;

import java.io.*;

public class CridaLectura {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try {
            System.out.println("Introdueix una cadena...");
            String texto = br.readLine();
            System.out.println("Cadena escrita: " + texto);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
