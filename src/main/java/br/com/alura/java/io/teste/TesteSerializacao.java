package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        // Serializando um Object type String
//        String nome = "Jeferson Torres";
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        oos.writeObject(nome);
//        oos.close();

        // Deserialização do Object type String
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String name = (String) ois.readObject();
        ois.close();
        System.out.println(name);



    }

}