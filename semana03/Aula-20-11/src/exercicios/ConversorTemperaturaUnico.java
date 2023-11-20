package exercicios;

import java.util.Scanner;

public class ConversorTemperaturaUnico {
    public static void main(String[] args) {
        int opc;
        float temp;

        Scanner sc = new Scanner(System.in);

        do{    
            System.err.println("\n0 - Celsius para Fahrenheit");
            System.err.println("1 - Fahrenheit para Celsius");
            System.err.print("Digite a opção: ");
            opc = sc.nextInt();
            if (opc!=0 && opc!=1)
                System.out.println("Opcao invalida!!");
        }while(opc!=0 && opc!=1);
        
        System.err.print("\nDigite a temperatura: ");
        temp = sc.nextFloat();

        System.out.println("\nTemperatura convertida: " + conversao(temp, opc));

        sc.close();
    }

    // opcao == 0 conversao Celsius para Fahrenheit
    // opcao == 1 conversao Fahrenheit para Celsius
    public static float conversao(float temp, int opcao) {
        if (opcao ==0)
            return (temp * 9/5) + 32;
        else
            return (temp - 32) * 5/9;

    }
}
