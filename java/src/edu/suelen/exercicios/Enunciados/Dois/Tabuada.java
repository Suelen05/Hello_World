package edu.suelen.exercicios.Enunciados.Dois;

public class Tabuada {

    public static void main(String[] args) {
        tabuada(2);
    }

    public static void tabuada(int n){

        for (int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }

    }

}
