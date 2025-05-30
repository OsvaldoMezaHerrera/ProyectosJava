import Model.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu altura en metros");
        double altura = scanner.nextDouble();
        System.out.println("Ingresa tu peso en kg");
        double peso = scanner.nextDouble();

        Persona persona = new Persona(nombre, altura, peso);

        double imc = persona.calcularIMC();
        String clasificacion = persona.clasificarIMC();

        System.out.printf(persona.getNombre() + " tu IMC es: " + imc + " " + clasificacion);

        scanner.close();
    }
}