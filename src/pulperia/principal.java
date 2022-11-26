package principal;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class  principal {
	Calendar fecha = new Calendar() {
		
		 @Override
	        protected void computeTime() {
	            throw new UnsupportedOperationException("Not supported yet.");
	        }

	        @Override
	        protected void computeFields() {
	            throw new UnsupportedOperationException("Not supported yet."); 
	        }

	        @Override
	        public void add(int field, int amount) {
	            throw new UnsupportedOperationException("Not supported yet.");
	        }

	        @Override
	        public void roll(int field, boolean up) {
	            throw new UnsupportedOperationException("Not supported yet.");
	        }

	        @Override
	        public int getMinimum(int field) {
	            throw new UnsupportedOperationException("Not supported yet.");
	        }

	        @Override
	        public int getMaximum(int field) {
	            throw new UnsupportedOperationException("Not supported yet."); 
	        }

	        @Override
	        public int getGreatestMinimum(int field) {
	            throw new UnsupportedOperationException("Not supported yet.");
	        }

	        @Override
	        public int getLeastMaximum(int field) {
	            throw new UnsupportedOperationException("Not supported yet.");
	        }
	    };
	    Calendar c2 = new GregorianCalendar();
	    String nombreProveedor;
	    String apellido;
	    String producto;
	    String presentacion;
	    String clienteNombre;
	    int numCliente;
	    int cantidadProductos;
	    int numVenta;
	    float precioCompra;
	    float costos;
	    float gastos;
	    float margenDeGanancia;
	    float precioDeVenta;
	    float total;
	    int cantidad;
	    int totalProductos;
	    float descuento;
	    float subTotal;
	    float Tdescuento;
	    float TOTAL;
	    String array[];
	    Scanner enter = new Scanner(System.in);
	    metodos m = new metodos();

	    public principal() {

	    }

	    public principal(String nombreProveedor, String apellido, String producto, String presentacion,
				String clienteNombre, int numCliente, int cantidadProductos, int numVenta, float precioCompra,
				float costos, float gastos, float margenDeGanancia, float precioDeVenta, float total) {
			super();
			this.nombreProveedor = nombreProveedor;
			this.apellido = apellido;
			this.producto = producto;
			this.presentacion = presentacion;
			this.clienteNombre = clienteNombre;
			this.numCliente = numCliente;
			this.cantidadProductos = cantidadProductos;
			this.numVenta = numVenta;
			this.precioCompra = precioCompra;
			this.costos = costos;
			this.gastos = gastos;
			this.margenDeGanancia = margenDeGanancia;
			this.precioDeVenta = precioDeVenta;
			this.total = total;
	    }


	   

		/*Registrar Compras*/
	    public void compra() {

	        System.out.println("------------------------------------------------");
	        System.out.println("Hola, Bienvenido al Modulo de Compra");
	        System.out.println("------------------------------------------------");
	        System.out.println("Ingresa todos los campos solicitados ");
	        try {
	            FileWriter compra = new FileWriter("compra.txt", true);

	            BufferedWriter bw = new BufferedWriter(compra);
	            PrintWriter escribir = new PrintWriter(bw);

	            System.out.println("Proveedor: ");
	            nombreProveedor = enter.next();
	            System.out.println("Ingresa la cantidad de productos a Comprar: ");
	            cantidad = enter.nextInt();
	            for (int i = 1; i <= cantidad; i++) {
	                System.out.println("Nombre del producto N° " + i + " : ");
	                producto = enter.next();
	                System.out.println("Presentación: ");
	                presentacion = enter.next();
	                System.out.println("Precio de Compra: ");
	                precioCompra = enter.nextFloat();
	                System.out.println("Costos: ");
	                costos = enter.nextFloat();
	                System.out.println("Gastos: ");
	                gastos = enter.nextFloat();
	                System.out.println("Margen de ganancia: ");
	                margenDeGanancia = enter.nextFloat();
	                precioDeVenta = precioCompra + costos + gastos + margenDeGanancia;
	                System.out.println("Precio de Venta: " + precioDeVenta);

	                m.setNombreProveedor(nombreProveedor);
	                m.setProducto(producto);
	                m.setPresentacion(presentacion);
	                m.setPrecioCompra(precioCompra);
	                m.setCostos(costos);
	                m.setGastos(gastos);
	                m.setMargenDeGanancia(margenDeGanancia);
	                m.setPrecioDeVenta(precioDeVenta);
	            }
	            escribir.println(m.getNombreProveedor() + "," + m.getProducto() + "," + m.getCantidadProductos() + "," + m.getPresentacion() + ","
	                    + m.getPrecioCompra() + "," + m.getCostos() + "," + m.getGastos() + "," + m.getMargenDeGanancia() + "," + m.getPrecioDeVenta() + "," + c2.get(Calendar.DATE) + "," + c2.get(Calendar.MONTH));
	            escribir.close();
	            JOptionPane.showMessageDialog(null, "Compra registrada correctamente!");

	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "No se pudo registrar la compra");
	        }

	    }

	    public void mostrarCompra() throws IOException {

	        try {
	         
	            BufferedReader bufferLectura = new BufferedReader(new FileReader("compra.txt"));
	     
	            String linea = bufferLectura.readLine();

	            while (linea != null) {

	                String[] campos = linea.split(",");
	                System.out.println("------------------------------------------------");
	                System.out.println("Proveedor: " + campos[0]);
	                System.out.println("Productos: " + campos[1]);
	                System.out.println("Cantidad de productos: " + campos[2]);
	                System.out.println("Presentación: " + campos[3]);
	                System.out.println("Precio de Compra: " + campos[4]);
	                System.out.println("Costos: " + campos[5]);
	                System.out.println("Gastos: " + campos[6]);
	                System.out.println("Margen de Ganancia: " + campos[7]);
	                System.out.println("Precio de Venta: " + campos[8]);
	                linea = bufferLectura.readLine();
	            }
	        }catch (FileNotFoundException ex) {
		            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
		        }
	        }
	    
	/*Registrar Ventas*/
	    public void venta() {
	        System.out.println("------------------------------------------------");
	        System.out.println("Hola, Bienvenido al Modulo de Venta");
	        System.out.println("------------------------------------------------");
	        System.out.println("Ingresa todos los campos solicitados ");
	        
	        
	        try {
	             FileWriter venta = new FileWriter("venta.txt", true);

	            BufferedWriter bw = new BufferedWriter(venta);
	            PrintWriter escribir = new PrintWriter(bw);
	            
	            System.out.println("Nombre del cliente: ");
	            clienteNombre = enter.next();
	            System.out.println("Apellido: ");
	            apellido = enter.next();
	            System.out.println("Cantidad de productos a Vender: ");
	            totalProductos = enter.nextInt();
	            for (int i = 1; i <= totalProductos; i++) {
	                System.out.println("Producto a Vender N°: " + i);
	                producto = enter.next();
	                System.out.println("Precio de venta: ");
	                precioDeVenta = enter.nextFloat();
	                System.out.println("Cantidad: ");
	                cantidad = enter.nextInt();
	                subTotal += precioDeVenta * cantidad;
	                System.out.println("Sub total: " + subTotal);
	                
	                m.setClienteNombre(clienteNombre);
	                m.setApellido(apellido);
	                m.setProducto(producto);
	                m.setPrecioDeVenta(precioDeVenta);
	                
	            }
	            System.out.println("Descuento: ");
	            descuento = enter.nextFloat();
	            total += (subTotal * descuento);
	            TOTAL += subTotal - total;
	 
	            escribir.println(m.getClienteNombre()+ "," + m.getApellido() + "," + m.getProducto() + "," + cantidad +
	                    "," + subTotal + "," + total + "," + TOTAL);
	            escribir.close();
	            System.out.println("------------------------------------------------");
	            System.out.println("-------------------Factura----------------------");
	            System.out.println("Sub Total: " + subTotal);
	            System.out.println("Descuento: " + descuento);
	            System.out.println("ToTal : " + TOTAL);
	            System.out.println("------------------------------------------------");
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "No se pudo registrar la Venta");
	        }
	    }
	    /*Metodo para mostrar las ventas realizadas*/
	    public void mostrarVenta(){
	        try {
	          
	            BufferedReader bufferLectura = new BufferedReader(new FileReader("venta.txt"));
	      
	            String linea = bufferLectura.readLine();

	            while (linea != null) {

	                String[] campos = linea.split(",");
	                System.out.println("------------------------------------------------");
	                System.out.println("Nombre del Cliente: " + campos[0]);
	                System.out.println("Apellido del Cliente: " + campos[1]);
	                System.out.println("Producto: " + campos[2]);
	                System.out.println("Cantidad Vendida: " + campos[3]);
	                System.out.println("Sub Total: " + campos[4]);
	                System.out.println("Descuento: " + campos[5]);
	                System.out.println("Total: " + campos[6]);
	                linea = bufferLectura.readLine();
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "No se pudo Cargar la Venta");
	        }
	}
	
}
