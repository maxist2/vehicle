import model.Carro;
import model.moto;
import java.util.Scanner;

public class main {

    public static void agregarCarro(){
        Carro carro = new Carro();

    }
    public static void agregarMoto(){

    }
    public static void vender(){

    }
    public static void comprar(){

    }
    public static void main(String[] args) {
        System.out.println("Welcome to ingresar veiculo " +
                "\n 1 comprar" +
                "\n 2 vender");
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
            default:
                System.out.println("Opcion incorrecta");
                break;
        }




    }
}
