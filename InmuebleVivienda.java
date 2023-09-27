class InmuebleVivienda extends Inmueble {
    int numerodeHabitaciones;
    int numerodeBaños;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numerodeHabitaciones, int numerodeBaños) {
        super(identificadorInmobiliario, area, direccion);
        this.numerodeHabitaciones = numerodeHabitaciones;
        this.numerodeBaños = numerodeBaños;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Habitaciones: " + numerodeHabitaciones);
        System.out.println("Número de Baños: " + numerodeBaños);
    }
}

