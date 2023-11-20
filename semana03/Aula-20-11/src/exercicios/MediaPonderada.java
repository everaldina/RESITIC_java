package exercicios;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        float n1, n2, n3;
        float p1, p2, p3;
        Scanner sc = new Scanner(System.in);

        // lendo notas
        System.out.print("\nDigite a nota 1: ");
        n1 = sc.nextFloat();
        System.out.print("Digite a nota 2: ");
        n2 = sc.nextFloat();
        System.out.print("Digite a nota 3: ");
        n3 = sc.nextFloat();

        // lendo pesos
        System.out.print("\nDigite o peso 1: ");
        p1 = sc.nextFloat();
        System.out.print("Digite o peso 2: ");
        p2 = sc.nextFloat();
        System.out.print("Digite o peso 3: ");
        p3 = sc.nextFloat();

        System.out.println("\nA média ponderada é: " + mediaPonderada(n1, n2, n3, p1, p2, p3));

        sc.close();
    }


    // retorna a média ponderada de um conjunto de 3 notas baseada em seus pesos
    public static float mediaPonderada(float nota1, float nota2, float nota3, float peso1, float peso2, float peso3) {
        return ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1 + peso2 + peso3);
    }
}
