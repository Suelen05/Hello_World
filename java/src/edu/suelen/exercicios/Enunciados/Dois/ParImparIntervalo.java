package edu.suelen.exercicios.Enunciados.Dois;

import java.util.Scanner;

public class ParImparIntervalo {
    public static void main(String[] args) {

        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("informe umm numero: ");
            int num1 = scanner.nextInt();
            System.out.println("Informe outro numero maior que o primeiro: ");
            int num2 = scanner.nextInt();
            System.out.println("Par ou Impar: ");
            String par = (scanner.next());
            

            if (par.equalsIgnoreCase("par")){
                achaPar(num1, num2);
            }else{
                achaImpar(num1, num2);
            }
        }

    }

    public static void achaPar(int num1, int num2){

        System.out.println("PAR");
        

        for(int i = num2; i >= num1; i--){
            
            if(i % 2 == 0){
                System.out.println(i);
            }
            
        }

    }

    public static void achaImpar(int num1, int num2){

        System.out.println("IMPAR");

        for( int i = num2; i >= num1; i--){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
