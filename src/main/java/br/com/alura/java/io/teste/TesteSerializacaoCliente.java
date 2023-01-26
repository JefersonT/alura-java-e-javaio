package br.com.alura.java.io.teste;

import br.com.alura.java.io.model.Cliente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("234113131");

        // Serializando Object type Cliente
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

    }

}