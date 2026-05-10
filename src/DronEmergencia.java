public class DronEmergencia extends Dron {

    private double recargoUrgencia;

    // CONSTRUCTOR SIN PARÁMETROS
    public DronEmergencia() {

        super("DE-000", "Emergencia", 5, 2, 1, 8.00);
        this.recargoUrgencia = 10.00;
    }

    // CONSTRUCTOR CON PARÁMETROS
    public DronEmergencia(String codigo, String modelo,
                          double distanciaKm, double pesoPaquete,
                          double horasVuelo) {

        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, 8.00);

        this.recargoUrgencia = 10.00;
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    public void setRecargoUrgencia(double recargoUrgencia) {

        if (recargoUrgencia >= 0) {
            this.recargoUrgencia = recargoUrgencia;
        } else {
            System.out.println("Error: recargo invalido");
        }
    }

    @Override
    public double calcularCostoEntrega() {

        return costoBase + (distanciaKm * 1.50)
                + (pesoPaquete * 0.90)
                + recargoUrgencia;
    }

    @Override
    public boolean validarDatos() {

        if (pesoPaquete > 10) {
            System.out.println("Error: peso supera el limite de 10 kg");
            return false;
        }

        if (horasVuelo > 3) {
            System.out.println("Error: horas exceden el limite");
            return false;
        }

        return true;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("====== DRON EMERGENCIA ======");
        super.mostrarInformacion();
        System.out.println("Recargo urgencia: $" + recargoUrgencia);
    }
}