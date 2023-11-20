package exercicios;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Estudante {
    private Date dataNascimento;
    private String nome;
    private String CPF;
    private Scanner sc = new Scanner(System.in);

    public Estudante(String nome, String CPF, String dataNascimento){
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = stringToDate(dataNascimento);
    }

    public Estudante(){
        System.out.print("Digite o nome do estudante: ");
        this.nome = sc.nextLine();
        System.out.print("Digite o CPF do estudante: ");
        this.CPF = sc.nextLine();
        System.out.print("Digite a data de nascimento do estudante: ");
        this.dataNascimento = stringToDate(sc.nextLine());
    }

    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        Estudante e2 = new Estudante("João", "123456789-00", "01/01/2000");

        e1.printEstudante();
        e2.printEstudante();
    }

    // converter uma string no formato dd/MM/yyyy para um objeto Date
    private static Date stringToDate(String data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = new Date();

        try{
            dataNascimento = sdf.parse(data);
        }catch (Exception e){
            System.out.println("Erro ao converter data.");
        }
        return dataNascimento;
    }

    public void printEstudante(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Data de nascimento: " + this.dataNascimento);
    }

    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.CPF;
    }
    public Date getDataNascimento(){
        return this.dataNascimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = stringToDate(dataNascimento);
    }



    
}
