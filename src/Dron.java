public abstract class Dron {

    protected String codigo;
    protected String modelo;
    protected double distanciaKm;
    protected double pesoPaquete;
    protected double horasVuelo;
    protected double costoBase;

    public Dron() {
    }

    public Dron(String codigo, String modelo, double distanciaKm,
                double pesoPaquete, double horasVuelo, double costoBase) {

        setCodigo(codigo);
        setModelo(modelo);
        setDistanciaKm(distanciaKm);
        setPesoPaquete(pesoPaquete);
        setHorasVuelo(horasVuelo);

        this.costoBase = costoBase;
    }

    // GETTERS

    public String getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    // SETTERS CON VALIDACIÓN

    public void setCodigo(String codigo) {

        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Error: codigo invalido");
        }
    }

    public void setModelo(String modelo) {

        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Error: modelo invalido");
        }
    }

    public void setDistanciaKm(double distanciaKm) {

        if (distanciaKm > 0) {
            this.distanciaKm = distanciaKm;
        } else {
            System.out.println("Error: distancia invalida");
        }
    }

    public void setPesoPaquete(double pesoPaquete) {

        if (pesoPaquete > 0) {
            this.pesoPaquete = pesoPaquete;
        } else {
            System.out.println("Error: peso invalido");
        }
    }

    public void setHorasVuelo(double horasVuelo) {

        if (horasVuelo > 0) {
            this.horasVuelo = horasVuelo;
        } else {
            System.out.println("Error: horas invalidas");
        }
    }

    // MÉTODOS ABSTRACTOS

    public abstract double calcularCostoEntrega();

    public abstract boolean validarDatos();

    // METODO CONCRETO

    public void mostrarInformacion() {

        System.out.println("Codigo: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Peso paquete: " + pesoPaquete + " kg");
        System.out.println("Horas de vuelo: " + horasVuelo);
        System.out.println("Costo base: $" + costoBase);
        System.out.println("Costo entrega: $" + calcularCostoEntrega());
    }
}