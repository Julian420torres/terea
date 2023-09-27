class Casa extends InmuebleVivienda {
    int numerodePisos;

    public Casa(int identificadorInmobiliario, int area, String direccion, int numerodeHabitaciones, int numerodeBaños, int numerodePisos) {
        super(identificadorInmobiliario, area, direccion, numerodeHabitaciones, numerodeBaños);
        this.numerodePisos = numerodePisos;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Pisos: " + numerodePisos);
    }
}
