import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner teclado= new Scanner(System.in);
        String monedaOrigen="";
        String monedaConvertir="";
        double cantidad=0;
        int opcionMenu=0;
        List<ConversorMoneda> monedas= new ArrayList<>();

        String menu= """
                ***********************************************************************
                Sea Bienvenido a al conversor de monedas =]
                
                1. Dolar =>>Peso argentino
                2. Peso argentino =>> Dolar 
                3. Dolar =>> Real brasileño
                4. Real brasileño =>> Dolar
                5. Dolar =>> Peso Colombiano 
                6. Peso colombiano =>> Dolar 
                7. Salir
                
                Elija una opción valida: 
                
                ***********************************************************************
                """;

        ConsultaApi consulta=new ConsultaApi();
        try {
            while (opcionMenu != 7) {

                System.out.println(menu);
                opcionMenu = Integer.valueOf(teclado.nextLine());

                switch (opcionMenu) {
                    case 1:
                        monedaOrigen = "USD";
                        monedaConvertir = "ARS";

                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad = Double.valueOf(teclado.nextLine());

                        break;
                    case 2:

                        monedaOrigen = "ARS";
                        monedaConvertir = "USD";
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad = Double.valueOf(teclado.nextLine());

                        break;
                    case 3:

                        monedaOrigen = "USD";
                        monedaConvertir = "BRL";
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad = Double.valueOf(teclado.nextLine());

                        break;
                    case 4:

                        monedaOrigen = "BRL";
                        monedaConvertir = "USD";
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad = Double.valueOf(teclado.nextLine());

                        break;
                    case 5:

                        monedaOrigen = "USD";
                        monedaConvertir = "COP";
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad = Double.valueOf(teclado.nextLine());

                        break;
                    case 6:

                        monedaOrigen = "COP";
                        monedaConvertir = "USD";
                        System.out.println("Ingrese la cantidad a convertir: ");
                        cantidad = Double.valueOf(teclado.nextLine());

                        break;
                    case 7:
                        System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                        GeneradorArchivo archivo = new GeneradorArchivo();
                        archivo.guardarJson(monedas);
                        break;
                    default:
                        System.out.println("Opción invalida");
                        break;


                }

                if(opcionMenu!=7){
                    Conversor conversor = consulta.consultarConversor(monedaOrigen, monedaConvertir);
                    ConversorMoneda moneda = new ConversorMoneda(monedaOrigen, monedaConvertir, cantidad);
                    moneda.convertirMoneda(conversor);
                    moneda.mostrarResultado();
                    monedas.add(moneda);
                }

            }
        }catch (NumberFormatException e){
            System.out.println("Numero no encontrado" +e.getMessage());

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("finalizando la aplicacion");
        }


    }
}