public class GestorInventario {
    private String nombreArticulo;
    private double precioUnitario;
    private int cantidadStock;

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public void procesarActualizacion(String nuevoNombre, double nuevoPrecio, int nuevaCantidad, double porcentajeDescuento) {
        actualizarDatos(nuevoNombre, nuevoPrecio, nuevaCantidad);
        double totalConDescuento = calcularTotalConDescuento(porcentajeDescuento);
        mostrarResumen(totalConDescuento);
    }

    private void actualizarDatos(String nuevoNombre, double nuevoPrecio, int nuevaCantidad) {
        setNombreArticulo(nuevoNombre);
        setPrecioUnitario(nuevoPrecio);
        setCantidadStock(nuevaCantidad);
    }

    private double calcularSubtotal() {
        return cantidadStock * precioUnitario;
    }

    private double calcularTotalConDescuento(double porcentajeDescuento) {
        double subtotal = calcularSubtotal();
        double montoDescuento = subtotal * (porcentajeDescuento / 100.0);
        return subtotal - montoDescuento;
    }

    private void mostrarResumen(double totalConDescuento) {
        System.out.println("Articulo: " + nombreArticulo + " | Stock: " + cantidadStock);
        System.out.println("Total inventario valorizado: $" + totalConDescuento);
    }

    public static void main(String[] args) {
        GestorInventario item = new GestorInventario();
        item.procesarActualizacion("Laptop Pro", 12500.0, 8, 10.0);
    }
}
