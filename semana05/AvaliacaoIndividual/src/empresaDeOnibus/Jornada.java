package empresaDeOnibus;

import java.util.ArrayList;

public class Jornada {
    static private int numeroJornadas = 0;
    private Motorista motorista;
    private ArrayList<Onibus> onibus;
    private int duracaoEstimada;
    private Cobrador cobrador;
    private int id;

    public Jornada(Motorista motorista) {}

    public int getId(){}
    public Motorista getMotorista(){}
    public ArrayList<Onibus> getOnibus(){}
    public Cobrador getCobrador(){}
    public int getDuracaoEstimada(){}
    public void setMotorista(Motorista motorista){}
    public void setCobrador(Cobrador cobrador){}


    public void adicionarCobrador(Cobrador cobrador) {}
    public void adicionarTrajeto(ArrayList<Onibus> onibus, int idTrajeto){}
    public void deletarTrajeto(int idTrajeto){}

}
