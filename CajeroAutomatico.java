import java.util.Scanner;

public class CajeroAutomatico {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;  // Saldo inicial

        while (true) {
            // Mostrar menú
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:  // Depositar dinero
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado. Su nuevo saldo es: $" + saldo);
                    break;
                case 2:  // Retirar dinero
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro realizado. Su nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:  // Salir
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta pronto!");
                    scanner.close();
                    return;  // Salir del programa
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        }
    }
}

