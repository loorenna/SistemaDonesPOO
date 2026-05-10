import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // OBJETOS QUEMADOS
        Dron d1 = new DronLiviano();
        Dron d2 = new DronCarga();
        Dron d3 = new DronEmergencia();

        // INFORMACIÓN INICIAL

        System.out.println("===== INFORMACION INICIAL DE DRONES =====\n");

        d1.mostrarInformacion();
        System.out.println();

        d2.mostrarInformacion();
        System.out.println();

        d3.mostrarInformacion();

        // INGRESO DE DATOS

        System.out.println("\n===== INGRESO DE NUEVOS DATOS =====");

        System.out.println("¿Que dron desea actualizar?");
        System.out.println("1. Dron Liviano");
        System.out.println("2. Dron Carga");
        System.out.println("3. Dron Emergencia");

        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        Dron dronSeleccionado;

        switch (opcion) {

            case 1:
                dronSeleccionado = d1;
                break;

            case 2:
                dronSeleccionado = d2;
                break;

            case 3:
                dronSeleccionado = d3;
                break;

            default:
                System.out.println("Opcion invalida");
                return;
        }

        System.out.print("Ingrese distancia (km): ");
        dronSeleccionado.setDistanciaKm(scanner.nextDouble());

        System.out.print("Ingrese peso del paquete (kg): ");
        dronSeleccionado.setPesoPaquete(scanner.nextDouble());

        System.out.print("Ingrese horas de vuelo: ");
        dronSeleccionado.setHorasVuelo(scanner.nextDouble());

        // VALIDACIÓN

        if (dronSeleccionado.validarDatos()) {

            System.out.println("\nLos datos cumplen con las validaciones.");

            System.out.print("¿Desea guardar los cambios? (s/n): ");
            scanner.nextLine();
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {

                System.out.println("\nDatos actualizados correctamente.");

            } else {

                System.out.println("No se guardaron los cambios.");
            }

        } else {

            System.out.println("\nNo se guardaron los cambios.");
        }

        // INFORMACIÓN ACTUALIZADA

        System.out.println("\n===== INFORMACION ACTUALIZADA =====\n");

        dronSeleccionado.mostrarInformacion();

        // POLIMORFISMO

        System.out.println("\n===== DEMOSTRACION DE POLIMORFISMO =====");

        Dron[] drones = {d1, d2, d3};

        for (Dron dron : drones) {

            System.out.println("--------------------------------");
            dron.mostrarInformacion();
        }

        // FIN DEL PROGRAMA

        System.out.println("\n===== FIN DEL PROGRAMA =====");
        System.out.println("Gracias por usar el sistema de drones.");

        scanner.close();
    }
}