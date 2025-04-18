import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
    public static void main(String[] args) throws Exception {

        System.out.println("Processo Seletivo\n");

        double salarioBase = 2000.0;
        String[] candidatos = {"Maria", "Joana", "Pedro", "Paulo", "João", "Marcia", "Vitor", "Rafael", "Aline", "Gustavo", "Julia", "Melissa", "Alexandre", "Josué", "Camila", "Leticia", "Bruno", "Gabriel", "Henrique", "Amanda", "Luciano"};
        double[] salariosPretendidos = new double[candidatos.length];

        for(int i = 0; i <salariosPretendidos.length; i++){
            salariosPretendidos[i] = valorPretendido();  //Define o salario pretendido pelo candidato
        }

        String[] candidatosSelecionados = selecaoCandidatos(candidatos, salariosPretendidos,  salarioBase); //seleciona os candidatos

        System.out.println("Foram selecionados os candidatos:");

        listaCandidatos(candidatosSelecionados);
        System.out.println();

        for (String candidato : candidatosSelecionados) {
            ligarCandidato(candidato);
        }

    }


    //Metodo que lista os candidatos

    static void listaCandidatos(String[] candidatos){

        for (String candidato : candidatos) {
            System.out.println(candidato);
            
        }
    }

    //Metodo que seleciona os candidatos de um array com o nome dos candidatos e o valor do salario base
    static String [] selecaoCandidatos(String[] candidatos, double[]salarioPretendido, double salarioBase){
        int indiceSelecionados = 0;                                                                         
        String[] candidatosSelecionados = new String[5];  //Array com os candidatos selecionados

        for(int candidatoAtual = 0; candidatoAtual < candidatos.length; candidatoAtual++){
            
            String candidato = candidatos[candidatoAtual]; //candidato sendo analisado
            double salario = salarioPretendido[candidatoAtual];  //Define o salario pretendido pelo candidato
            if (salario <= salarioBase){
                candidatosSelecionados[indiceSelecionados] = candidato;
                indiceSelecionados++; 
            }
            if (indiceSelecionados == candidatosSelecionados.length) {
                break;
                
            }

        }

        return candidatosSelecionados;

    }

    //Metodo que atribui um valor aleatório ao salario pretendido
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //
    public static void analisarCandidato(double salarioPretendido, double salarioBase){
        
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    //Ligar para os candidatos selecionados com no maximo 3 tentativas

    static void ligarCandidato (String candidato){
        int tentativasRealizadas = 1;
  
        boolean atendeu = false;

        do {
            
            atendeu =atender(); 
            tentativasRealizadas++;
        } while (!atendeu && tentativasRealizadas <=3);

        if(atendeu){
            System.out.println("O candidato " + candidato + " atendeu na " + (tentativasRealizadas - 1) + " tentativa");
        }else{
            System.out.println("O candidato " + candidato + " não atendeu, foram realizadas " + (tentativasRealizadas - 1) + " tentativa");
        }

    }

    static boolean atender(){
        return new Random().nextInt(5) == 1;
    }
}