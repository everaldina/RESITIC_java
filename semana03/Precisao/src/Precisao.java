public class Precisao {
    public static void main(String[] args) throws Exception {
        float floatX, floatY;
        double doubleX, doubleY;

        doubleX = 2.0;
        floatX = 2.0f;
        do{
            doubleY = doubleX;
            doubleX = doubleX / 2;
        }while(doubleX > 0);
        do{
            floatY = floatX;
            floatX = floatX / 2;
        }while(floatX > 0);

        // verificando precisao com double e float
        System.out.println("Double: " + doubleY);
        System.out.println("Float: " + floatY);
    }
}
