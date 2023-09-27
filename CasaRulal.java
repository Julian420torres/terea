class CasaRural extends Casa {
    int distanciaCabecera;
    int altitud;

     static final double ValorMetro = 1500000.0;
    
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numerodeHabitaciones, int numerodeBaños, int numerodePisos, int distanciaCabecera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numerodeHabitaciones, numerodeBaños, numerodePisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
         this.precioVenta = calcularPrecioVenta(ValorMetro);
    }
     public double calcularPrecioVenta(double valorArea) {
      
        return area * ValorMetro;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la Cabecera Municipal: " + distanciaCabecera + " km");
        System.out.println("Altitud sobre el Nivel del Mar: " + altitud + " metros");
    }
}

