import java.util.Scanner;

public class Menu {
    //mostrarmenumetodo de la clase menu que muestra menu al usuario
    public void mostrarMenu(){
        System.out.println("===================================");
        System.out.println("         CONVERSOR DE MONEDAS");
        System.out.println("===================================");
        System.out.println("1) Peso Argentino ==> Dólar");
        System.out.println("2) Dólar ==> Peso Argentino");
        System.out.println("3) Real Brasileño ==> Dólar");
        System.out.println("4) Dólar ==> Real Brasileño");
        System.out.println("5) Peso Colombiano ==> Dólar");
        System.out.println("6) Dólar ==> Peso Colombiano");
        System.out.println("7) Salir");
        System.out.println("Seleccione una opción ");
        System.out.println("===================================");
    }
//metodo que lee entrada del ususario de la opcion
    public static int  leerOpcion(Scanner scanner){
        int opcion = scanner.nextInt();
        return   opcion;

    }
    //metodo que lee entrada del usuario de la cantidad
    public static double leerCantidad(Scanner scanner){
        double cantidad = scanner.nextDouble();
        return cantidad;
    }
}
