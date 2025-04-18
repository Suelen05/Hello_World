package edu.suelen.exemplos.ExemploCriarExeptions;

import java.util.Scanner;

public class FormatarCEP {
    public static void main(String[] args) throws CepInvalidExeption {
        try {
            Scanner scanner = new Scanner(System.in);
            String cep = scanner.nextLine();
            cep = formatarCEP(cep);
        
            System.out.println("CEP formatado: " +  cep);
            scanner.close();
                
        } catch (CepInvalidExeption e) {
            System.out.println("Formato invalido");
        } 
    }

    public static String formatarCEP (String cep) throws CepInvalidExeption{
        if (cep.length() != 8){
            throw new CepInvalidExeption(); 
        }
        String cepFormatado = new String();

        String primeiros5 = cep.substring(0, 5);
        //System.out.println(primeiros5);
        String final3 = cep.substring(5, cep.length());
        //System.out.println(final3);

        cepFormatado = primeiros5 + "-" + final3;
        
        return cepFormatado;

    }

}
