package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        OutputStream fis = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fis);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("dkjfçlkaoir fa oifaofmadçlfk oia ofi asdfialkfa soi");
        bw.newLine();
        bw.write("çlkfa 0adsi fsdfi oids osdif sdaofiasd foiasd fasif as");

        bw.close();


    }
}