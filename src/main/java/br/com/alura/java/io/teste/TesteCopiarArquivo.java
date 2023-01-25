package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

//        InputStream file  = new FileInputStream("lorem.txt");
        InputStream file  = System.in;
        Reader isr = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(isr);

//        OutputStream fis = new FileOutputStream("lorem2.txt");
        OutputStream fis = System.out;
        Writer osw = new OutputStreamWriter(fis);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while (line != null && !line.isEmpty()){
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }

        br.close();
        bw.close();


    }
}