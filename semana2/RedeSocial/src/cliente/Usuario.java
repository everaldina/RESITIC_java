package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nome, email, nacionalidade;
    private ArrayList<String> postagens;
    int quantidadePostagens, pontuacao;




    public Usuario(String nome, String email, String nacionalidade) {
        this.nome = nome;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.postagens = new ArrayList<String>();
        quantidadePostagens = 0;
        pontuacao = 0;
    }
    public Usuario(){
        this.nome = "";
        this.email = "";
        this.nacionalidade = "";
        this.postagens = new ArrayList<String>();
        quantidadePostagens = 0;
        pontuacao = 0;
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        String postagem;
        
        // lendo dados do usuario
        System.out.print("Digite o nome do usuario: ");
        usuario.setNome(scanner.nextLine());
        System.out.print("Digite o email do usuario: ");
        usuario.setEmail(scanner.nextLine());
        System.out.print("Digite a nacionalidade do usuario: ");
        usuario.setNacionalidade(scanner.nextLine());
        System.out.println("Usuario cadastrado com sucesso!");


        // imprimindo dados do usuario
        System.out.println("\nNome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Nacionalidade: " + usuario.getNacionalidade());
        System.out.println("Quantidade de postagens: " + usuario.getQuantidadePostagens());
        System.out.println("Pontuacao: " + usuario.getPontuacao());


        // adicionando postagem
        System.out.print("\nDigite a postagem: ");
        postagem = scanner.nextLine();
        usuario.adicionaPostagem(postagem);
        System.out.println("Postagem adicionada com sucesso!");


        // alterando pontuacao
        System.out.print("\nDigite adicao a pontuacao: ");
        usuario.alteraPontuacao(scanner.nextInt());

        // imprime novos dados
        System.out.println("\nNome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Nacionalidade: " + usuario.getNacionalidade());
        System.out.println("Quantidade de postagens: " + usuario.getQuantidadePostagens());
        System.out.println("Pontuacao: " + usuario.getPontuacao());



        scanner.close();
    }

    // adiciona uma postagem
    public void adicionaPostagem(String post){
        this.postagens.add(post);
        quantidadePostagens++;
    }

    // altera pontuação com um valor adicional, que pode ser positivo ou negativo
    public void alteraPontuacao(int delta){
        this.pontuacao += delta;
        if(this.pontuacao < 0)
            this.pontuacao = 0;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getQuantidadePostagens() {
        return quantidadePostagens;
    }

    public int getPontuacao() {
        return pontuacao;
    }


}
