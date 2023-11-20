package exercicios;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) throws Exception {
        float a, b;
        char op;
        Scanner sc = new Scanner(System.in);

        // leitura dos dados
        System.out.print("Digite número A: ");
        a = sc.nextFloat();
        System.out.print("Digite número B: ");
        b = sc.nextFloat();
        sc.nextLine(); // limpa o buffer do teclado

        // menu de opções
        System.out.println("\nA - Adição");
        System.out.println("S - Subtração");
        System.out.println("M - Multiplicação");
        System.out.println("D - Divisão");
        System.out.print("Digite a operação: ");
        op = sc.nextLine().toLowerCase().charAt(0);
        System.out.println();

        // print do resultado
        switch ((int)op) {
            case 'a':
                System.out.println("A + B = " + (a + b));
                break;
            case 's':
                System.out.println("A - B = " + (a - b));
                break;
            case 'm':
                System.out.println("A * B = " + (a * b));
                break;
            case 'd':
                if(b == 0) 
                    System.out.println("Não é possível dividir por zero!");
                else
                    System.out.println("A / B = " + (a / b));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }
}
