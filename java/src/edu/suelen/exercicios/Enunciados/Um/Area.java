package edu.suelen.exercicios.Enunciados.Um;

public class Area {

    public static void main(String[] args) {

       System.out.println(areaQuadrado(2.5)); 
       System.out.println(areaRetangulo(2.5, 3)); 
    }
    
    public static double areaQuadrado (double lado){

        return lado * lado;

    }

    public static double areaRetangulo(double base, double altura){

        return base * altura;

    }

}
