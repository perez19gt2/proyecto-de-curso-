package principal;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class pulperia {
	
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        principal p = new principal();
        int opcion = 0;

        try {
            do {

                System.out.println("------------------------------------------------");
                System.out.println("Hola, Bienvenido a Pulperia la Violencia");
                System.out.println("------------------------------------------------");
                System.out.println("---------------Menu de Opciones-----------------");
                System.out.println("------------------------------------------------");
                System.out.println("-----------Escoge una de las opciones-----------");
                System.out.println("------------------------------------------------");
                System.out.println("\t1. Compra de productos");
                System.out.println("\t2. Venta de productos");
                System.out.println("\t3. Ver lista de Compras");
                System.out.println("\t4. Ver lista de Venta");
                System.out.println("\t5. Salir");

                System.out.println("\nOpcion N°: ");
                opcion = enter.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has escogido la opcion N° " + opcion);
                        p.compra();
                        break;
                    case 2:
                        System.out.println("Has escogido la opcion N° " + opcion);
                        p.venta();
                        break;
                    case 3:
                        System.out.println("----------Lista De Compras--------- ");
                        p.mostrarCompra();
                        System.out.println("------------------------------------------------");
                        break;
                    case 4:
                        System.out.println("----------Lista De Ventas--------- ");
                        p.mostrarVenta();
                        System.out.println("------------------------------------------------");
                        break;
                    case 5:
                        System.out.println("Hasta la proxima");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("ERROR! escoge una opcion valida!");
                        break;
                }
            } while (opcion != 5);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR!");

        }

    }
}
