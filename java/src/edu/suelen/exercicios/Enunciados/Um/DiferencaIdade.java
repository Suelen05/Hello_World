package edu.suelen.exercicios.Enunciados.Um;

import java.util.Scanner;

public class DiferencaIdade {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o nome da primeira pessoa: ");
            String nome1 = scanner.nextLine();
            System.out.println("Informe a idade dela: ");
            int idade1 = scanner.nextInt(); 
            scanner.nextLine();
   
            
            System.out.println("Informe o nome da segunda pessoa: ");
            String nome2 = scanner.nextLine();
            System.out.println("Informe a idade dela: ");
            int idade2 = scanner.nextInt(); 

            System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaIdade(idade1, idade2) + " anos.");
        }

        
    }

    public static int diferencaIdade (int idade1, int idade2){
        if (idade1 > idade2){
            return idade1 - idade2;
        }else{
            return idade2 - idade1;
        }
    }

}
