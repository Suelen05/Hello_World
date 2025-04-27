package edu.suelen.exemplos.ExemploInterfaces.Multifuncional;

import edu.suelen.exemplos.ExemploInterfaces.Copiadora.Copiadora;
import edu.suelen.exemplos.ExemploInterfaces.Digitalizadora.Digitalizadora;
import edu.suelen.exemplos.ExemploInterfaces.Impressora.Impressora;


public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora  {

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("Imprimindo...");
        
    }

    @Override
    public void digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("Digitalizando...");
       
    }

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("Copiando...");
        
    } //não permite herdar Copiadora e Impressora ao mesmo tempo
    
}
