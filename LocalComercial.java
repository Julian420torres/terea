class LocalComercial extends Local {
    double valorArea;
    String centroComercial;

    static final double ValorMetro = 3000000.0;
    
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, double valorArea, String centroComercial) {
        super(identificadorInmobiliario, area, direccion);
        this.valorArea = valorArea;
        this.centroComercial = centroComercial;
        this.precioVenta = calcularPrecioVenta(ValorMetro);

    }
    public double calcularPrecioVenta(double valorArea) {
     
        return area * ValorMetro;
    }

    public void imprimir() {
        super.imprimir();
         System.out.println("Valor de Área: $" + valorArea);
        System.out.println("Centro Comercial: " + centroComercial);
    }
}