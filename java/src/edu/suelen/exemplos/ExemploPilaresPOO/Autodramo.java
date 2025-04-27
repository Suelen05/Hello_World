package edu.suelen.exemplos.ExemploPilaresPOO;

public class Autodramo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setPlaca("Rfu3h88");
        jeep.ligar();
        System.out.println(jeep.getPlaca());

        Moto suzuki = new Moto();
        suzuki.ligar();
        suzuki.setPlaca("siudoau");
        System.out.println(suzuki.getPlaca());
        
    }

}
