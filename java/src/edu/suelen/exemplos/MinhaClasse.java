package edu.suelen.exemplos;

public class MinhaClasse {
    public static void main (String[] args){

        System.out.println("Hello World!!\n");
        
        //--------------------------------------------------------
        //Exemplo de ternario

        boolean condicao = true;
        String resultado = condicao ?"Caso seja verdadeira\n" : "Caso seja falsa\n";
        System.out.println(resultado);

        condicao = false;
        resultado = condicao ?"Caso seja verdadeira\n" : "Caso seja falsa\n";
        System.out.println(resultado);

        //--------------------------------------------------------
        //Exemplo de constante

        final String EXEMPLO_DE_CONSTANTE = "VALOR QUE NÃO MUDA\n";

        System.out.println(EXEMPLO_DE_CONSTANTE);

    }
    
}
