package br.com.alura.java.io.teste;

import br.com.alura.java.io.model.Cliente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente clienteDeserializeble = (Cliente) ois.readObject();
        ois.close();

        System.out.println(clienteDeserializeble.getNome());
        System.out.println(clienteDeserializeble.getCpf());
        System.out.println(clienteDeserializeble.getProfissao());

    }

}