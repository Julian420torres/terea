class ApartamentoFamiliar extends Apartamento {
    double valorArea;
    int valorAdministracion;

    static final double ValorMetro = 2000000.0;
    
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numerodeHabitaciones, int numerodeBaños, double valorArea, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numerodeHabitaciones, numerodeBaños);
        this.valorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
        this.precioVenta = calcularPrecioVenta(ValorMetro);
    }
    public double calcularPrecioVenta(double valorArea) {
        
        return area * ValorMetro;
    }


    public void imprimir() {
        super.imprimir();
        System.out.println("El valor de Área es: $" + valorArea);
        System.out.println("El valor de Administración es: $" + valorAdministracion);
    }
}