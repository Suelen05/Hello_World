package edu.suelen.exemplos.ExemploInterfaces;

//import edu.suelen.exemplos.ExemploInterfaces.Digitalizadora.Digitalizadora;
import edu.suelen.exemplos.ExemploInterfaces.Digitalizadora.Scanner;
import edu.suelen.exemplos.ExemploInterfaces.Impressora.Deskjet;
import edu.suelen.exemplos.ExemploInterfaces.Impressora.Impressora;
import edu.suelen.exemplos.ExemploInterfaces.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    
    public static void main(String[] args) {
        
        EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();
        Scanner scanner = new Scanner(); //Cuidar com o pacote que esta sendo importado

        Impressora impressora = deskjet;
        //Digitalizadora digitalizadora = deskjet; //deskjet não consegue ser uma digitalizadora pois não possui essa interface
        impressora.imprimir(); // impressora consegue imprimir pois é uma deskjet
        deskjet.imprimir(); // deskjet imprimi pois implementou Impressora
        //deskjet.copiar(); // deskjet não consegue copiar pois não implementou Copiadora
        multifuncional.copiar(); // Multifuncional consegue fazer os 3 pois implementou as 3 interfaces
        multifuncional.digitalizar();
        multifuncional.imprimir();

    }

    
}
