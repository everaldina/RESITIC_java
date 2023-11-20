package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiz q = new Quiz();

        q.menuRegistrarPergunta(sc);
        q.menuJogar(sc);

        sc.close();
    }

    public void addPergunta(Scanner sc){
        String enunciado;
        String[] alternativas = new String[4];
        int resposta;

        System.out.print("\nDigite o enunciado da pergunta: ");
        enunciado = sc.nextLine();

        for(int i=0;i<4;i++){
            System.out.print("Digite a alternativa " + (i+1) + ": ");
            alternativas[i] = sc.nextLine();
        }

        
        do{
            System.out.print("Digite a resposta correta: ");
            resposta = sc.nextInt();
            if (resposta < 1 || resposta > 4)
                System.out.println("Opção inválida.");
        }while(resposta < 1 || resposta > 4);

        Pergunta p = new Pergunta(enunciado, alternativas, resposta);
        this.perguntas.add(p);
    }

    public boolean verificarResposta(int resposta, int indice){
        if(resposta == this.perguntas.get(indice).getResposta())
            return true;
        else
            return false;
    }

    public void menuRegistrarPergunta(Scanner sc){
        int opcao;
        boolean cont = true;
        do{
            System.out.println("\n1 - Registrar pergunta");
            System.out.println("0 -  Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 0:
                    cont = false;
                    break;
                case 1:
                    addPergunta(sc);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(cont);
    }

    public void menuJogar(Scanner sc){
        int opcao;
        boolean cont = true;
        int countCorretas = 0;
        for(int i=0;i<this.perguntas.size();i++){
            System.out.println("\nPergunta " + (i+1) + ": ");
            this.perguntas.get(i).printQuestao();
            do{
                System.out.println("\nDigite a resposta: ");
                opcao = sc.nextInt();
                if (opcao < 1 || opcao > 4)
                    System.out.println("Opção inválida.");
            }while(opcao < 1 || opcao > 4);
            if(verificarResposta(opcao, i)){
                countCorretas++;
                System.out.println("Resposta correta!");
            }else
                System.out.println("Resposta incorreta!");
            
        }

        System.out.println("Acertos: " + countCorretas + "/" + this.perguntas.size() + " perguntas.");
    }
}
