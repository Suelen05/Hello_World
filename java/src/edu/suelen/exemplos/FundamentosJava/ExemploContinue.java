package edu.suelen.exemplos.FundamentosJava;

public class ExemploContinue {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
    }
}
