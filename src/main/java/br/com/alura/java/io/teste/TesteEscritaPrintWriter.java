package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("lorem2.txt", "UTF-8");

        pw.println("dkjfçlkaoir fa oifaofmadçlfk oia ofi asdfi asdfasd fas");
        pw.println("çlkfa 0adsi fsdfi oids osdif sdaofiasd dsfasdf");
        pw.close();

    }
}