import model.Carro;
import model.Moto;
import model.Vehiculo;
import service.Prueba_Ruta;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList<Carro> carros = new ArrayList<>();
    static ArrayList<Moto> motos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void agregarCarro() {


        System.out.println("Ingrese la marca del carro: ");
        String marca = scanner.next();
        System.out.println("Ingrese el modelo del carro: ");
        String modelo = scanner.next();
        System.out.println("Ingrese la placa del carro: ");
        String placa = scanner.next();
        System.out.println("Ingrese la velocidad maxima del carro: ");
        int velocidad_maxima = scanner.nextInt();
        System.out.println("Ingrese la traccion del carro: ");
        String traccion = scanner.next();


        Carro carro = new Carro(marca, modelo, placa, velocidad_maxima, traccion);
        carros.add(carro);

        System.out.println("Carro agregado");
    }

    public static void agregarMoto() {

        System.out.println("Ingrese la marca de la moto: ");
        String marca = scanner.next();
        System.out.println("Ingrese el modelo de la moto: ");
        String modelo = scanner.next();
        System.out.println("Ingrese la placa de la moto: ");
        String placa = scanner.next();
        System.out.println("Ingrese la velocidad maxima de la moto: ");
        int velocidad_maxima = scanner.nextInt();
        System.out.println("Ingrese el cilindraje de la moto: ");
        String cilindraje = scanner.next();

        Moto moto = new Moto(marca, modelo, placa, velocidad_maxima, cilindraje);
        motos.add(moto);

        System.out.println("Moto agregada");

    }
    public static void catalogo() {
        System.out.println("Listado de Carros:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        System.out.println("Listado de Motos:");
        for (Moto moto : motos) {
            System.out.println(moto);
        }
    }

    public static void vender() {
        System.out.println("Ingrese el tipo de vehículo que desea vender (1 para carro, 2 para moto): ");
        int tipo = scanner.nextInt();

        System.out.println("Ingrese la placa del vehículo que desea vender: ");
        String placa = scanner.next();

        switch (tipo) {
            case 1:
                for (int i = 0; i < carros.size(); i++) {
                    if (carros.get(i).getPlaca().equals(placa)) {
                        carros.remove(i);
                        System.out.println("Carro con placa " + placa + " eliminado del catálogo");
                        return;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < motos.size(); i++) {
                    if (motos.get(i).getPlaca().equals(placa)) {
                        motos.remove(i);
                        System.out.println("Moto con placa " + placa + " eliminada del catálogo");
                        return;
                    }
                }
                break;
            default:
                System.out.println("Tipo de vehículo inválido.");
                return;
        }

        System.out.println("No se encontró ningún vehículo con la placa " + placa + " en el catálogo.");
    }
    public static void prueba() {
        Prueba_Ruta prueba = new Prueba_Ruta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehículo (1 para carro, 2 para moto, o cualquier otro valor para salir): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline character

        String placa = "";
        Vehiculo vehiculo = null;

        switch (tipo) {
            case 1:
                System.out.println("Ingrese la placa del carro: ");
                placa = scanner.nextLine();
                for (Carro carro : carros) {
                    if (carro.getPlaca().equals(placa)) {
                        vehiculo = carro;
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Ingrese la placa de la moto: ");
                placa = scanner.nextLine();
                for (Moto moto : motos) {
                    if (moto.getPlaca().equals(placa)) {
                        vehiculo = moto;
                        break;
                    }
                }
                break;
            default:
                System.out.println("No se encontró ningún vehículo con la placa " + placa + " en el catálogo.");
                return;
        }

        if (vehiculo != null) {
            System.out.println("Seleccione una acción: \n1. Estacionar\n2. Dirigir\n3. Acelerar\n4. Frenar");

                prueba.estacionamiento(vehiculo);
                prueba.direccion(vehiculo);
                prueba.acelerar(vehiculo);
                prueba.frenar(vehiculo);

            }
        }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Bienvenido al sistema de administracion" +
                    "\n 1. Comprar" +
                    "\n 2. Vender" +
                    "\n 3. Catalogo" +
                    "\n 4. hacer prueba" +
                    "\n 5. Salir");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Elige una opcion: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Ingrese 1 para carro o 2 para moto: ");
                    int opcion = scanner.nextInt();

                    if (opcion == 1) {
                        agregarCarro();
                    } else if (opcion == 2) {
                        agregarMoto();
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                    break;
                case 2:
                    vender();
                    break;
                case 3:
                    catalogo();
                    break;
                case 4:
                    prueba();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}
