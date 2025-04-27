package edu.suelen.exemplos.PilaresPOO;

public abstract class Veiculo {

    private String placa;
    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract void ligar(); //Cada classe que herdar veiculo vai precisar implementar o método ligar, isso é a abstração, e como os métodos são diferentes entre si é também polimorfismo
    
}
