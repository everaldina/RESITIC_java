package exercicios;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Estudante {
    public static void main(String[] args) {
        Date dataNascimento;
        String nome;
        String CPF;
        Scanner sc = new Scanner(System.in);

        // lendo dados do estudante
        System.out.print("Digite o nome do estudante: ");
        nome = sc.nextLine();
        System.out.print("Digite o CPF do estudante: ");
        CPF = sc.nextLine();
        System.out.print("Digite a data de nascimento do estudante: ");
        dataNascimento = stringToDate(sc.nextLine());

        // imprimir dados do estudante
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Data de nascimento: " + dataNascimento);

        sc.close();
        
    }

    // converter uma string no formato dd/MM/yyyy para um objeto Date
    public static Date stringToDate(String data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = new Date();

        try{
            dataNascimento = sdf.parse(data);
        }catch (Exception e){
            System.out.println("Erro ao converter data.");
        }
        return dataNascimento;
    }


    
}
