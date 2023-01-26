package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner lineScanner = new Scanner(linha);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String tipoConta = lineScanner.next();
            Integer agencia = lineScanner.nextInt();
            Integer numero = lineScanner.nextInt();
            String titular = lineScanner.next();
            Double saldo = lineScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt", "BR"),
                    "%s - %05d-%05d, %20s: %010.2f",
                    tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);

            lineScanner.close();

        }

        scanner.close();

    }
}
