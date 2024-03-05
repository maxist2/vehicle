//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import model.Carro;
import model.Moto;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos de la moto
        System.out.println("Ingrese los datos de la moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Placa: ");
        String placaMoto = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaMoto = scanner.nextInt();
        System.out.print("Cilindraje: ");
        int cilindraje = scanner.nextInt();

        Moto moto = new Moto(marcaMoto, modeloMoto, placaMoto, velocidadMaximaMoto, cilindraje);

        // Ingresar datos del carro
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.println("\nIngrese los datos del carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Placa: ");
        String placaCarro = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaCarro = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Tracción (mecánica o automática): ");
        String traccion = scanner.nextLine();

        Carro carro = new Carro(marcaCarro, modeloCarro, placaCarro, velocidadMaximaCarro, traccion);

        // Prueba de ruta
        System.out.println("\n¡Prueba de ruta de la moto!");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Velocidad Máxima: " + moto.getVelocidadMaxima());
        System.out.println("Cilindraje: " + moto.getCilindraje());

        System.out.println("\n¡Prueba de ruta del carro!");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Velocidad Máxima: " + carro.getVelocidadMaxima());
        System.out.println("Tracción: " + carro.getTraccion());
    }
}