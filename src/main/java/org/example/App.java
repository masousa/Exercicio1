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
        System.out.println("Informe o nome");
        String nome = scanner.next();
        System.out.println("Informe o sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Informe a data de nascimento no padrão dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(scanner.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf("Olá meu nome %s %s tenho %d anos %n", nome, sobrenome,   dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS));

    }
}
