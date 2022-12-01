package org.example;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Informe o nome");
        pessoa.nome = scanner.next();
        System.out.println("Informe o sobrenome");
        pessoa.sobreNome = scanner.next();
        System.out.println("Informe a data de nascimento no padrão dd/MM/yyyy");
        pessoa.dataNascimento = LocalDate.parse(scanner.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf(pessoa.saudacao());

    }
}
