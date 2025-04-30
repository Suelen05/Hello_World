package edu.suelen.exercicios.Enunciados.Um;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculoIdade {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe seu nome");
            String nome = scanner.nextLine();
            System.out.println(("Informe sua data de nascimento no formato dd/mm/aaaa:"));
            
            int anos = calculoIdade(scanner.nextLine());
            
            System.out.println("Olá " + nome + " você tem " + anos + " anos");
        }
    }

     public static int calculoIdade (String dataDeNascimento){

        String[] data = dataDeNascimento.split("/");
        int idade = 0;

        //System.out.println(LocalDate.now().getMonthValue());
        //SuelenSystem.out.println(LocalDate.now().getDayOfMonth());
        
        if (Integer.parseInt(data[1]) >= LocalDate.now().getMonthValue()){
            if(Integer.parseInt(data[0]) >= LocalDate.now().getDayOfMonth()){
                idade = LocalDate.now().getYear() - Integer.parseInt(data[2]);
            }else{
                idade = LocalDate.now().getYear() - Integer.parseInt(data[2])-1;
            }
        }   else{
            idade = LocalDate.now().getYear() - Integer.parseInt(data[2]);
        }
        
    
        return idade;

    }

}
