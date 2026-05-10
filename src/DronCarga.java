public class DronCarga extends Dron {

    private double costoPorKg;

    // CONSTRUCTOR SIN PARÁMETROS
    public DronCarga() {

        super("DC-000", "Carga", 5, 2, 1, 6.00);
        this.costoPorKg = 1.20;
    }

    // CONSTRUCTOR CON PARÁMETROS
    public DronCarga(String codigo, String modelo,
                     double distanciaKm, double pesoPaquete,
                     double horasVuelo) {

        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, 6.00);

        this.costoPorKg = 1.20;
    }

    public double getCostoPorKg() {
        return costoPorKg;
    }

    public void setCostoPorKg(double costoPorKg) {

        if (costoPorKg > 0) {
            this.costoPorKg = costoPorKg;
        } else {
            System.out.println("Error: costo invalido");
        }
    }

    @Override
    public double calcularCostoEntrega() {

        return costoBase + (distanciaKm * 1.20) + (pesoPaquete * costoPorKg);
    }

    @Override
    public boolean validarDatos() {

        if (pesoPaquete > 30) {
            System.out.println("Error: peso supera el limite de 30 kg");
            return false;
        }

        if (horasVuelo > 5) {
            System.out.println("Error: horas exceden el limite");
            return false;
        }

        return true;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("====== DRON CARGA ======");
        super.mostrarInformacion();
        System.out.println("Costo por kg: $" + costoPorKg);
    }
}