package edu.suelen.exemplos.PilaresPOO;

public class Carro extends Veiculo{ //Extends é a aplicação dos métodos e variáveis da classe Veiculo na classe Carro

    
    public void ligar(){
        confereCambio(); // o método confereCambio estar em ligar é um exemplo de encapsulamento
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo Combustível");

    }

    private void confereCambio(){
        System.out.println("Conferindo se o cambio esta em P");

    }
    
}