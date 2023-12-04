package empresaDeOnibus;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected String dataNascimento;

    public Pessoa(String nome, String cpf, String rg, String dataNascimento) {}

    public String getNome(){}
    public void setNome(String nome){}
    public String getCpf(){}
    public void setCpf(String cpf){}
    public String getRg(){}
    public void setRg(String rg){}
    public String getDataNascimento(){}
    public void setDataNascimento(String dataNascimento){}

    public int getIdade(){}
    public boolean ehMaiorDeIdade(){}

    public boolean cpfValido(){}
    public boolean rgValido(){}

}
