class CasaConjuntoCerrado extends CasaUrbana {
    double valorAdministracion;
    boolean tienePiscina;
    boolean tieneCamposDeportivos;
   
    static final double ValorMetro = 2500000.0;
    
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numerodeHabitaciones, int numerodeBaños, double valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numerodeHabitaciones, numerodeBaños);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
        this.precioVenta = calcularPrecioVenta(ValorMetro);
    }
    public double calcularPrecioVenta(double valorArea) {
       
        return area * ValorMetro;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de Administración: $" + valorAdministracion);
        System.out.println("cuenta con Piscina: " + (tienePiscina ? "Sí" : "No"));
        System.out.println("cuenta con Campos Deportivos: " + (tieneCamposDeportivos ? "Sí" : "No"));
    }
}