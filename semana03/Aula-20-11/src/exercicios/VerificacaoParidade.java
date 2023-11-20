package exercicios;

import java.util.Scanner;

public class VerificacaoParidade {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        // lendo os numeros
        System.out.print("Digite um numero inteiro: ");
        n = sc.nextInt();

        System.out.println("O numero " + String.valueOf(n) + " é " + paridade(n).toLowerCase());

    }

    public static String paridade(int numero){
        if(numero % 2 == 0)
            return "Par";
        else
            return "Impar";
    }
}
