package edu.suelen.exemplos.FundamentosJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Informe seu nome: ");
                String nome = scanner.nextLine();
   
                System.out.println("Informe seu sobrenome: ");
                String sobrenome = scanner.nextLine();
   
                System.out.println("Informe sua idade: ");
                int idade = scanner.nextInt();
   
                System.out.println("Informe sua altura: ");
                double altura = scanner.nextDouble();
   
                System.out.println("Olá me chamo " + nome + " " + sobrenome);
                System.out.println("Tenho " + idade + " anos de idade");
                System.out.println("Minha altura é " + altura + "m");
                
            } catch (InputMismatchException e) {
                System.out.println("A idade e a altura precisam estar em caracteres numericos");
                main(args);
            }
        scanner.close();
        }
    }
}
