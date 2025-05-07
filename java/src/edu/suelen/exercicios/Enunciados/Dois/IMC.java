package edu.suelen.exercicios.Enunciados.Dois;

import java.util.Scanner;


public class IMC {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe sua altura: ");
            double altura = scanner.nextDouble();
            System.out.println("Informe seu peso: ");
            double peso = scanner.nextDouble();

            double imc = calculoIMC(altura, peso);

            if(imc <= 18.5){

                System.out.println("Abaixo do peso");

            } else if(imc < 25){

                System.out.println("Peso ideal");

            }else if (imc < 30){

                System.out.println("Levemente acima do peso");

            }else if(imc < 35){

                System.out.println("Obesidade grau I");

            }else if(imc < 40){

                System.out.println("Obesidade grau II (severa)");

            }else{
                System.out.println("Obesidade grau III (mórbida)");
            }
        }


    }

    public static double calculoIMC (double altura, double peso){
        return peso / (altura * altura);
    }

}
