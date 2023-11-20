package exercicios;

import java.util.Scanner;

public class VerificacaoIdade_v1 {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite idade: ");
        idade = sc.nextInt();

        if(idade > 18)
            System.out.println("Usuario maior de idade.");
        else
            System.out.println("Usuario menor de idade.");


        sc.close();
    }
}
