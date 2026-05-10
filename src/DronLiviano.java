public class DronLiviano extends Dron {

    private double limiteHoras;

    // CONSTRUCTOR SIN PARÁMETROS
    public DronLiviano() {

        super("DL-000", "Liviano", 5, 2, 1, 3.00);
        this.limiteHoras = 2;
    }

    // CONSTRUCTOR CON PARÁMETROS
    public DronLiviano(String codigo, String modelo,
                       double distanciaKm, double pesoPaquete,
                       double horasVuelo) {

        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, 3.00);

        this.limiteHoras = 2;
    }

    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setLimiteHoras(double limiteHoras) {

        if (limiteHoras > 0) {
            this.limiteHoras = limiteHoras;
        } else {
            System.out.println("Error: limite invalido");
        }
    }

    @Override
    public double calcularCostoEntrega() {

        return costoBase + (distanciaKm * 0.80) + (pesoPaquete * 0.50);
    }

    @Override
    public boolean validarDatos() {

        if (pesoPaquete > 5) {
            System.out.println("Error: peso supera el limite de 5 kg");
            return false;
        }

        if (horasVuelo > limiteHoras) {
            System.out.println("Error: horas exceden el limite");
            return false;
        }

        return true;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("====== DRON LIVIANO ======");
        super.mostrarInformacion();
        System.out.println("Limite horas: " + limiteHoras);
    }
}