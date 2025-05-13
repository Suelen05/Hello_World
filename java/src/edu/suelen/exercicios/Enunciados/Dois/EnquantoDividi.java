package edu.suelen.exercicios.Enunciados.Dois;

import java.util.Scanner;

public class EnquantoDividi {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();
        int n = 0;
        do {
            System.out.println("Informe um numero: ");
            n = scanner.nextInt();
            
        } while (n % numero != 0);
    }

}
