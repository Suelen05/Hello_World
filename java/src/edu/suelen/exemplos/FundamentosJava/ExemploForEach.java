package edu.suelen.exemplos.FundamentosJava;

public class ExemploForEach {
    public static void main(String[] args) {
        
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        System.out.println();
    }
}
