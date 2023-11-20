package exercicios;

public class AreaRetangulo {
    public static void main(String[] args) {
        int l = 10, h = 20;
        System.out.println("Base = " + l);
        System.out.println("Altura = " + h);
        System.out.println("Area do retangulo = " + calculaArea(l, h));
    }

    public static int calculaArea(int largura, int altura){
        return largura*altura;
    }
}
