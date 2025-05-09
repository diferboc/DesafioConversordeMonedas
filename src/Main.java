import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double cantidad;

        //mostrar menu

        Menu miMenu = new Menu();
        miMenu.mostrarMenu();

        //leer opcion
        opcion = miMenu.leerOpcion(scanner);
        System.out.println("opcion elegida = "+opcion);

        //leer cantidad a convertir

        System.out.println("ingrese la cantidad a convertir");
        cantidad = Menu.leerCantidad(scanner);
        System.out.println("cantidad ingresada "+cantidad);

        //creo una objeto intercambio que trae informacion en Json y se cambia a calse java
        ServicioDeIntercambio intercambio = new ServicioDeIntercambio();

        // instancio la clase exchanrate response la cual es el molde de la clase que contendra
        // datos recibidos
        ExchangeRateResponse respuesta = intercambio.obtenerTasas();

        //instancio un map que recibe todas las tasas en un Json
        Map<String, Double> tasas = respuesta.getConversion_rates();

        //condicional opcion para el usuario

      switch (opcion){
            case 1:
                double pesoArgentino = tasas.get("ARS");
                System.out.println( "Peso argentinos  = "+pesoArgentino);
                System.out.println(cantidad + " Pesos argentinos = "+cantidad / pesoArgentino+" Dolares" );
                break;
          case 2:
                pesoArgentino = tasas.get("ARS");
                System.out.println(cantidad+" dolares = "+cantidad*pesoArgentino+" Pesos Argentinos ");
                break;
          case 3:
              double realBrasilero = tasas.get("BRL");
              System.out.println( "Real brasilero  = "+realBrasilero);
              System.out.println(cantidad + " Reales brasileros = "+cantidad / realBrasilero+" Dolares" );
              break;
          case 4:
              realBrasilero = tasas.get("BRL");
              System.out.println(cantidad+" dolares = "+cantidad*realBrasilero+" Reales brasileros ");
              break;
          case 5:
              double pesoColombiano = tasas.get("COP");
              System.out.println( "Peso colombiano  = "+pesoColombiano);
              System.out.println(cantidad + " Pesos Colombiano = "+cantidad / pesoColombiano+" Dolares" );
              break;
          case 6:
              pesoColombiano = tasas.get("COP");
              System.out.println(cantidad+" dolares = "+cantidad*pesoColombiano+" Pesos colombianos ");
              break;



        }

    }
}