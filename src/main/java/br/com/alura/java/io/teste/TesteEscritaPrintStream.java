package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("lorem2.txt", "UTF-8");

        ps.println("dkjfçlkaoir fa oifaofmadçlfk oia ofi asdfialkfa soi asdf");
        ps.println("çlkfa 0adsi fsdfi oids osdif sdaofiasd foiasd fasif as asdf");
        ps.close();

    }
}