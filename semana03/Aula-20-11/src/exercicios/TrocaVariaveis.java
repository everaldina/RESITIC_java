package exercicios;

public class TrocaVariaveis {
    public static void main(String[] args) {
        int var1 = 10, var2 = 5, temp;

        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        // usando variavel temporaria
        temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("TROCANDO");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);

        // usando XOR
        var1 = var1 ^ var2;
        var2 = var1 ^ var2;
        var1 = var1 ^ var2;

        System.out.println("TROCANDO");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);

    }
}
