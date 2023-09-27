public class Main {
    public static void main(String[] args) {
        CasaRural casaRural = new CasaRural(1, 200, "Calle Principal", 3, 2, 2, 10, 500);
        CasaConjuntoCerrado casaConjunto = new CasaConjuntoCerrado(2, 150, "Calle Secundaria", 4, 3, 200, true, true);
        CasaIndependiente casaIndependiente = new CasaIndependiente(3, 180, "Avenida Principal", 5, 4, 250000);

        ApartaEstudio apartaEstudio = new ApartaEstudio(4, 40, "Carrera Principal", 35.5);
        ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(5, 80, "Calle Secundaria", 2, 2, 75, 150);
        
        LocalComercial localComercial = new LocalComercial(6, 100, "Centro Comercial XYZ", 80, "Centro Comercial XYZ");
        Oficina oficina = new Oficina(7, 120, "Edificio de Oficinas", 100, true);

        System.out.println("Detalles de la Casa Rural:");
        casaRural.imprimir();
        System.out.println("\nDetalles de la Casa en Conjunto Cerrado:");
        casaConjunto.imprimir();
        System.out.println("\nDetalles de la Casa Independiente:");
        casaIndependiente.imprimir();
        System.out.println("\nDetalles del Apartaestudio:");
        apartaEstudio.imprimir();
        System.out.println("\nDetalles del Apartamento Familiar:");
        apartamentoFamiliar.imprimir();
        System.out.println("\nDetalles del Local Comercial:");
        localComercial.imprimir();
        System.out.println("\nDetalles de la Oficina:");
        oficina.imprimir();
    }
}





