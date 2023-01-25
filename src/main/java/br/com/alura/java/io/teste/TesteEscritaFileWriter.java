package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        // completo
//        FileWriter fw = new FileWriter("lorem2.txt");
//        BufferedWriter bw = new BufferedWriter(fw);

        //Simplificado
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        // Com BufferedWriter
        bw.write("dkjfçlkaoir fa oifaofmadçlfk oia ofi asdfialkfa soi");
        bw.newLine();
        bw.write("çlkfa 0adsi fsdfi oids osdif sdaofiasd foiasd fasif as");
        bw.close();

        // Sem BufferedWriter
//        fw.write("dkjfçlkaoir fa oifaofmadçlfk oia ofi asdfialkfa soi");
//        fw.write(System.lineSeparator()); //O FileWriter não possui o método newLine, então substitua-o e, através do método write, escreva o caractere especial que representa uma nova linha, mas esse caractere varia de acordo com o sistema operacional. O Java possui um método que retorna esse caractere especial baseado no seu sistema operacional, o método lineSeparator(), de System
//        fw.write("çlkfa 0adsi fsdfi oids osdif sdaofiasd foiasd fasif as");
//        fw.close();




    }
}