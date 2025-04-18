package edu.suelen.exemplos;

public class ExemploSwitchCase {
    public static void main(String[] args) {
      
        char tamanho = 'G';
        switch (tamanho) {
            case 'P':
                System.out.println("PEQUENO\n");
                break;

            case 'M':
                System.out.println("MEDIO\n");
                break;

            case 'G':
                System.out.println("GRANDE\n");
                //break;
                // Se tirar o break, o programa roda o próximo case independente
        
            default:
                System.out.println("INDEFINIDO\n");
                break;
        }
    }
}
