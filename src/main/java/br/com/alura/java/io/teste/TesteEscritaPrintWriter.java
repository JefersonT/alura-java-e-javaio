package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("lorem2.txt");

        pw.println("dkjfçlkaoir fa oifaofmadçlfk oia ofi asdfialkfa soi");
        pw.println("çlkfa 0adsi fsdfi oids osdif sdaofiasd foiasd fasif as");
        pw.close();

    }
}