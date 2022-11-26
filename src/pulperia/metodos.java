package principal;

public class metodos {
 private String nombreProveedor;
    private String apellido;
    private String producto;
    private String presentacion;
    private String clienteNombre;
    private int numCliente;
    private int cantidadProductos;
    private int numVenta;
    private int numCompra;
    private float precioCompra;
    private float costos;
    private float gastos;
    private float margenDeGanancia;
    private float precioDeVenta;
    private float total;

    public metodos() {

    }

    public metodos(String nombreProveedor, String apellido, String producto, String presentacion, String clienteNombre, int numCliente, int cantidadProductos, int numVenta, int numCompra, float precioCompra, float costos, float gastos, float margenDeGanancia, float precioDeVenta, float total) {
        this.nombreProveedor = nombreProveedor;
        this.apellido = apellido;
        this.producto = producto;
        this.presentacion = presentacion;
        this.clienteNombre = clienteNombre;
        this.numCliente = numCliente;
        this.cantidadProductos = cantidadProductos;
        this.numVenta = numVenta;
        this.numCompra = numCompra;
        this.precioCompra = precioCompra;
        this.costos = costos;
        this.gastos = gastos;
        this.margenDeGanancia = margenDeGanancia;
        this.precioDeVenta = precioDeVenta;
        this.total = total;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getCostos() {
        return costos;
    }

    public void setCostos(float costos) {
        this.costos = costos;
    }

    public float getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public float getMargenDeGanancia() {
        return margenDeGanancia;
    }

    public void setMargenDeGanancia(float margenDeGanancia) {
        this.margenDeGanancia = margenDeGanancia;
    }

    public float getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(float precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
