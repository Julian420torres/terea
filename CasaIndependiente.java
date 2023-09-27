class CasaIndependiente extends CasaUrbana {
    double valorArea;

    static final double ValorMetro = 3000000.0; // 3,000,000

    
    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numerodeHabitaciones, int numerodeBaños, double valorArea) {
        super(identificadorInmobiliario, area, direccion, numerodeHabitaciones, numerodeBaños);
        this.valorArea = valorArea;
        this.precioVenta = calcularPrecioVenta(ValorMetro);
    }
    public double calcularPrecioVenta(double valorArea) {
        
        return area * ValorMetro;
    }
    

    public void imprimir() {
        super.imprimir();
        System.out.println("El valor del Área es: $" + valorArea);
    }
}
