package edu.suelen.exemplos;

public class ExemploTernario {
    public static void main(String[] args) {
        
        boolean condicao = true;
        String resultado = condicao ? "Caso seja verdadeira\n" : "Caso seja falsa\n";
        System.out.println(resultado);

        condicao = false;
        resultado = condicao ? "Caso seja verdadeira\n" : "Caso seja falsa\n";
        System.out.println(resultado);

    }
}
