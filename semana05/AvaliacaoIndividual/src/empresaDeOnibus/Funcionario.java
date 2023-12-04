package empresaDeOnibus;

public abstract class Funcionario extends Pessoa{
    protected float salario;
    protected String cargo;
    protected String dataAdmissao;
    protected String dataDemissao;

    public Funcionario(String nome, String cpf, String rg, String dataNascimento, float salario, String cargo, String dataAdmissao) {}

    public float getSalario(){}
    public void setSalario(float salario){}
    public String getCargo(){}
    public void setCargo(String cargo){}
    public String getDataAdmissao(){}
    public void setDataAdmissao(String dataAdmissao){}
    public String getDataDemissao(){}

    public void demitir(String dataDemissao){}
    public boolean estaAtivo(){}
    public int getTempoDeServico(){}


}
