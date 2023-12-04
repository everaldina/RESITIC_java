package empresaDeOnibus;

import java.util.ArrayList;

public class Trecho {
    private static int idCounter = 0;
    private int id;
    private Ponto origem;
    private Ponto destino;
    private int duracao;
    private ArrayList<Embarque> embarques;

    public Trecho(Ponto origem, Ponto destino, int duracao) {}

    public Ponto getOrigem(){}
    public Ponto getDestino(){}
    public void setOrigem(Ponto origem){}
    public void setDestino(Ponto destino){}
    public int getDuracao(){}
    public void setDuracao(int duracao){}
    public ArrayList<Embarque> getEmbarques(){}
    public int getId(){}


    public void adicionarEmbarque(Embarque embarque){}

}
