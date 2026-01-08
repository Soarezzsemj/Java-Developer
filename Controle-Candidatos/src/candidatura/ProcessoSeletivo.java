package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        //selecaoCandidatos();
        //imprimirSelecionados();

         String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA"};
          for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }


    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
                
            } else {
                System.out.println("contato realizado com sucesso");
            }
            
        } while (continuarTentando && tentativasRealizadas < 3); 

        if (atendeu) {
            System.out.println("conseguimos contato com " + candidato + " NA " + tentativasRealizadas + " tentativa ");
        } else {
            System.out.println("nao conseguimos contato com " + candidato + " numero maximo de tentativas " + tentativasRealizadas + " realizadas");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("o candidato de numero " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("agora com o foreach");

        for(String candidato: candidatos){
            System.out.println("o candidato selecionado foi " + candidato);
        }

    }
    
    public static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE", "ROBERTO"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            
            double salarioPretendido = valorPretendido();
            
            System.out.println("o candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                
            }
            candidatoAtual++;
            
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800 , 2200);
    }

    //static n retorna nada 
    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contraproposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
        
    }

}
