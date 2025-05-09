package edu.suelen.exemplos.ExemploInterfaces.Multifuncional;

import edu.suelen.exemplos.ExemploInterfaces.Copiadora.Copiadora;
import edu.suelen.exemplos.ExemploInterfaces.Digitalizadora.Digitalizadora;
import edu.suelen.exemplos.ExemploInterfaces.Impressora.Impressora;


public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora  {

    @Override
    public void imprimir() {
        
        System.out.println("Imprimindo...");
        
    }

    @Override
    public void digitalizar() {
        
        System.out.println("Digitalizando...");
       
    }

    @Override
    public void copiar() {
        
        System.out.println("Copiando...");
        
    } //não permite herdar Copiadora e Impressora ao mesmo tempo
    
}
