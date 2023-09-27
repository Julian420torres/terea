class Inmueble {
    int identificadorInmobiliario;
    int area;
    String direccion;
    double precioVenta;

    static final double ValorMetro = 1000000.0; 

    
    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
        this.precioVenta = calcularPrecioVenta(ValorMetro);
    }

    public double calcularPrecioVenta(double valorArea) {
        return area * valorArea;
    }

    public void imprimir() {
        System.out.println("Identificador Inmobiliario: " + identificadorInmobiliario);
        System.out.println("Área: " + area + " metros cuadrados");
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio de Venta: $" + precioVenta);
    }
}