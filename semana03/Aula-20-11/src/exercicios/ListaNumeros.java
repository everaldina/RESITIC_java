package exercicios;

import java.util.ArrayList;

public class ListaNumeros {
    ArrayList<Float> numeros = new ArrayList<Float>();
    public static void main(String[] args) {


    }

    public void novoNumero(float f){
        numeros.add(f);
    }

    public void listaNumeros(){
        for(int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
    }

    public float media(){
        float soma = 0;
        for(int i=0;i<numeros.size();i++){
            soma += numeros.get(i);
        }
        return soma/numeros.size();
    }
}
