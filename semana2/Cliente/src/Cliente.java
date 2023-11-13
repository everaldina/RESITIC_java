import java.util.Scanner;

public class Cliente {
    private String nome, CPF;
    private int idade;

    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getCPF() {
        return CPF;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome, CPF;

        System.out.print("Digite o nome do cliente: ");
        nome = s.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        CPF = s.nextLine();

        Cliente c = new Cliente(nome, CPF);
        System.out.println("\nDADOS DO CLIENTE");
        System.out.println("Nome do cliente: " + c.getNome());
        System.out.println("CPF do cliente: " + c.getCPF());
        System.out.println("Idade do cliente: " + c.getIdade());

        System.out.print("\nDigite a idade do cliente: ");
        c.setIdade(s.nextInt());

        System.out.println("\nDADOS ATUALIZADOS");
        System.out.println("Nome do cliente: " + c.getNome());
        System.out.println("CPF do cliente: " + c.getCPF());
        System.out.println("Idade do cliente: " + c.getIdade());

        s.close();
    }
}
