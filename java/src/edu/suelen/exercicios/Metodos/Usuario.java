package edu.suelen.exercicios.Metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("Esta liagada? " + smartTV.ligada);
        System.out.println("Qual canal? " + smartTV.canal);
        System.out.println("Qual volume? " + smartTV.volume);
        
    }
}
