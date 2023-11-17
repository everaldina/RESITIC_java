import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) throws Exception {
        float a, b;
        int op;
        Scanner sc = new Scanner(System.in);

        // leitura dos dados
        System.out.print("Digite número A: ");
        a = sc.nextFloat();
        System.out.print("Digite número B: ");
        b = sc.nextFloat();

        // menu de opções
        System.out.println("\n1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite a operação: ");
        op = sc.nextInt();
        System.out.println();

        // print do resultado
        switch (op) {
            case 1:
                System.out.println("A + B = " + (a + b));
                break;
            case 2:
                System.out.println("A - B = " + (a - b));
                break;
            case 3:
                System.out.println("A * B = " + (a * b));
                break;
            case 4:
                if(b == 0) 
                    System.out.println("Não é possível dividir por zero!");
                else
                    System.out.println("A / B = " + (a / b));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
