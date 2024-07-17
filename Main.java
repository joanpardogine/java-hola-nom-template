import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implementar el codi que demani el nom de l'usuari i imprimeixi "Hola" seguit del nom de l'usuari.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el teu nom:");
        String nom = scanner.nextLine();
        System.out.println("Hola " + nom);
    }
}
