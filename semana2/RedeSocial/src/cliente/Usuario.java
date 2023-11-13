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
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        Scanner scanner = new Scanner(System.in);
        String postagem, nome, email, nacionalidade;
        char sn;

        do{
            System.out.print("Digite o nome do usuário: ");
            nome = scanner.nextLine();
            System.out.print("Digite o email do usuário: ");
            email = scanner.nextLine();
            System.out.print("Digite a nacionalidade do usuário: ");
            nacionalidade = scanner.nextLine();

            Usuario usuario = new Usuario(nome, email, nacionalidade);
            listaUsuarios.add(usuario);

            System.out.print("\nDeseja inserir mais usuarios (s/n)? ");
            sn = scanner.nextLine().charAt(0);
            System.out.print("\n");
        }while(sn != 'n' && sn != 'N');
        



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
