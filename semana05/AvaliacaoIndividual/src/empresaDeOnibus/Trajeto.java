package empresaDeOnibus;

import java.util.ArrayList;

public class Trajeto {
    private static int idCounter = 0;
    private int id;
    private ArrayList<Trecho> trechos;
    private String dataInicio;
    private String horaInicio;
    private String horaCheckPoint;
    private int duracaoEstimada;


    public Trajeto(String dataInicio, String horaInicio) {}

    public ArrayList<Trecho> getTrechos(){}
    public String getDataInicio(){}
    public String getHoraInicio(){}
    public String getHoraCheckPoint(){}
    public int getDuracaoEstimada(){}
    public int getId(){}
    public void setDataInicio(String dataInicio){}
    public void setHoraInicio(String horaInicio){}

    public void adicionarTrecho(Trecho trecho) {}
    public void finalizarTrajeto() {}

}
