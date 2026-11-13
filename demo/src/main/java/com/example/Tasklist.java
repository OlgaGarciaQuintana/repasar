package com.example;

import java.io.*;

public class Tasklist {
    public static void main(String[] args) {
        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec("tasklist /v");

            PrintWriter pw = new PrintWriter(new FileOutputStream("procesos.txt"));

            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream())
            );

            String linea;

            while ((linea = br.readLine()) != null) {
                pw.println(linea);
            }
            br.close();
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
