package exercicios;

import java.util.Scanner;

public class VerificacaoIdade_v2 {
    
    public static void main(String[] args) {
        int diaNasc = 0, mesNasc = 0, anoNasc = 0;
        int diaAtual = 0, mesAtual = 0, anoAtual = 0;
        Scanner sc = new Scanner(System.in);
        boolean dataValida = false;
        int idade;

        // lendo data de nascimento
        while(!dataValida){
            System.out.print("\nDigite dia de nascimento: ");
            diaNasc = sc.nextInt();
            System.out.print("Digite mes de nascimento: ");
            mesNasc = sc.nextInt();
            System.out.print("Digite ano de nascimento: ");
            anoNasc = sc.nextInt();

            dataValida = dataValida(diaNasc, mesNasc, anoNasc);
            if(!dataValida)
                System.out.println("Data invalida, digite novamente.");
        }
        dataValida = false;

        // lendo data atual
        while(!dataValida){
            System.out.print("\nDigite dia atual: ");
            diaAtual = sc.nextInt();
            System.out.print("Digite mes atual: ");
            mesAtual = sc.nextInt();
            System.out.print("Digite ano atual: ");
            anoAtual = sc.nextInt();

            dataValida = dataValida(diaAtual, mesAtual, anoAtual);
        }

        // calculando idade
        idade = anoAtual - anoNasc;
        if(mesAtual < mesNasc)
            idade--;
        else if(mesAtual == mesNasc && diaAtual < diaNasc)
            idade--;

        // exibindo resultado
        System.out.println("\nUsuario tem: " + idade + " anos.");

        sc.close();
    }

    // verifica se uma data é valida
    public static boolean dataValida(int dia, int mes, int ano) {
        int maxDiasFevereiro = anoBissexto(ano) ? 29 : 28;

        // Verifica se o mês é válido
        if (mes < 1 || mes > 12) {
            return false;
        } else if (mes == 2 && (dia < 1 || dia > maxDiasFevereiro)) // Fevereiro
            return false;
        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) // Meses com 30 dias
            return false;
        else if (dia < 1 || dia > 31) // Meses com 31 dias
            return false;

        // caso não tenha retornado falso, a data é válida
        return true;
    }

    // verifica se o ano é bissexto
    public static boolean anoBissexto(int ano) {
        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
            return true;
        else
            return false;
    }
}
