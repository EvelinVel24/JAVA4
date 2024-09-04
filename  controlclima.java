import java.util.Scanner;

public class ControlClima {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("Bienvenido. Por favor, ingrese la temperatura del día: ");
        int temperatura = scanner.nextInt();

        // Evaluar el clima según la temperatura
        String tipoClima;
        if (temperatura <= 10) {
            tipoClima = "frío";
        } else if (temperatura <= 20) {
            tipoClima = "nublado";
        } else if (temperatura <= 30) {
            tipoClima = "caluroso";
        } else {
            tipoClima = "tropical";
        }

        // Mostrar el resultado
        System.out.println("Hay " + temperatura + " grados. El tipo de clima hoy es " + tipoClima + ".");

        scanner.close();
    }
}
