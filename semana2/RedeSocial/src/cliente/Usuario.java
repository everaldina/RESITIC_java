package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nome, email, nacionalidade;
    private ArrayList<String> postagens;

    public Usuario(String nome, String email, String nacionalidade) {
        this.nome = nome;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.postagens = new ArrayList<String>();
    }
    public Usuario(){
        this.nome = "";
        this.email = "";
        this.nacionalidade = "";
        this.postagens = new ArrayList<String>();   
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

        // adicionando postagem
        System.out.print("\nDigite a postagem: ");
        postagem = scanner.nextLine();
        usuario.adicionaPostagem(postagem);



        scanner.close();
    }

    // adiciona uma postagem
    public void adicionaPostagem(String post){
        this.postagens.add(post);
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


}
