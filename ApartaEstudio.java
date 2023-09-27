class ApartaEstudio extends Apartamento {
    double valordeArea;

    static final double ValorMetro = 1500000.0;
    
    public ApartaEstudio(int identificadorInmobiliario, int area, String direccion, double valordeArea) {
        super(identificadorInmobiliario, area, direccion, 1, 1);
        this.valordeArea = valordeArea;
        this.precioVenta = calcularPrecioVenta(ValorMetro);
    }
    public double calcularPrecioVenta(double valorArea) {
       
        return area * ValorMetro;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("El valor del Área es: $" + valordeArea);
    }
}
