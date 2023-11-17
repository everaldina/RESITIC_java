import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        boolean opc;
        float temp;

        Scanner sc = new Scanner(System.in);

        System.err.println("0 - Celsius para Fahrenheit");
        System.err.println("1 - Fahrenheit para Celsius");
        System.err.print("Digite a opção: ");
        opc = (sc.nextInt() == 0) ? false : true;
        
        System.err.print("Digite a temperatura: ");
        temp = sc.nextFloat();

        if(opc)
            System.out.println("\nTemperatura em Celsius: " + FahrenheitToCelsius(temp));
        else
            System.out.println("\nTemperatura em Fahrenheit: " + celsiusToFahrenheit(temp));

    }

    // metodo para converter de celsius para fahrenheit
    public static float celsiusToFahrenheit(float cTemp) {
        return (cTemp * 9/5) + 32;
    }

    // metodo para converter de fahrenheit para celsius
    public static float FahrenheitToCelsius(float fTemp) {
        return (fTemp - 32) * 5/9;
    }
}
