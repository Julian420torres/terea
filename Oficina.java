class Oficina extends Local {
    double valorArea;
    boolean esGobierno;

    static final double ValorMetro = 3500000.0;
    
    public Oficina(int identificadorInmobiliario, int area, String direccion, double valorArea, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion);
        this.valorArea = valorArea;
        this.esGobierno = esGobierno;
        this.precioVenta = calcularPrecioVenta(ValorMetro);
    }
    public double calcularPrecioVenta(double valorArea) {
      
        return area * ValorMetro;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de Área: $" + valorArea);
        System.out.println("Es del Gobierno: " + (esGobierno ? "Sí" : "No"));
    }
}
