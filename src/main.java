import model.Carro;
import model.Moto;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


public class main {



    static ArrayList<String> vehiculo = new ArrayList<>();
    static Scanner scan_car = new Scanner(System.in);

    public static void agregarCarro() {


        Carro carro = new Carro();
        System.out.println("Ingrese la marca del carro: ");
        carro.setMarca(scan_car.next());
        System.out.println("Ingrese el modelo del carro: ");
        carro.setModelo(scan_car.next());
        System.out.println("Ingrese la placa del carro: ");
        carro.setPlaca(scan_car.next());
        System.out.println("Ingrese la velocidad maxima del carro: ");
        carro.setVelocidad_maxima(scan_car.nextInt());
        System.out.println("Ingrese la traccion del carro: ");
        carro.setTraccion(scan_car.next());

        vehiculo.add(carro.getMarca());
        vehiculo.add(carro.getModelo());
        vehiculo.add(carro.getPlaca());
        vehiculo.add(Integer.toString(carro.getVelocidad_maxima()));
        vehiculo.add(carro.getTraccion());

        System.out.println("Carro agregado");
    }

    public static void agregarMoto() {

        Moto moto = new Moto();
        System.out.println("Ingrese la marca de la moto: ");
        moto.setMarca(scan_car.next());
        System.out.println("Ingrese el modelo de la moto: ");
        moto.setModelo(scan_car.next());
        System.out.println("Ingrese la placa de la moto: ");
        moto.setPlaca(scan_car.next());
        System.out.println("Ingrese la velocidad maxima de la moto: ");
        moto.setVelocidad_maxima(scan_car.nextInt());
        System.out.println("Ingrese el cilindraje de la moto: ");
        moto.setCilindraje(scan_car.next());

        vehiculo.add(moto.getMarca());
        vehiculo.add(moto.getModelo());
        vehiculo.add(moto.getPlaca());
        vehiculo.add(Integer.toString(moto.getVelocidad_maxima()));
        vehiculo.add(moto.getCilindraje());


    }

    public static void catalogo() {
        for (String catalogo : vehiculo) {
            System.out.println(catalogo);
        }
    }

    public static void vender() {


    }

    public static void comprar() {
        Scanner scan_car = new Scanner(System.in);
        System.out.println("1 carro\n2 moto");
        System.out.println("Ingrese una opcion: ");
        int num = scan_car.nextInt();
        switch (num) {
            case 1:
                agregarCarro();
                break;
            case 2:
                agregarMoto();
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("vienvendido al sistema de administracion" +
                    "\n 1 comprar" +
                    "\n 2 vender" +
                    "\n 3 Catalogo" +
                    "\n 4 salir");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Elige una opcion: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    comprar();
                    break;
                case 2:
                    vender();
                    break;
                case 3:
                    catalogo();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }


    }
}

