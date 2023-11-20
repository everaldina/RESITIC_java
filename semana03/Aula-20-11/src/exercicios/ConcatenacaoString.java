package exercicios;

import java.util.Scanner;

public class ConcatenacaoString {
    public static void main(String[] args) {
        String str1 = "Hello", str2 = " World", str3 = str1 + str2;

        System.out.println("String concatenada: " + str3);

        printString(concatena());
    }

    public static String concatena() {
        String str1, str2;
        Scanner sc = new Scanner(System.in);

        // lendo strings
        System.out.print("Digite a primeira string: ");
        str1 = sc.nextLine();
        System.out.print("Digite a segunda string: ");
        str2 = sc.nextLine();
        
        sc.close();
        return str1 + str2;
    }

    public static void printString(String str) {
        System.out.println(str);
    }
}
