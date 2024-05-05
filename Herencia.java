package herencia;
import java.util.Scanner;

public class Herencia {
    public static void main(String[] args) {
        //Complejidad constante O(1) por ser una impresión de mensajes y asignación de valores
        //a través de la consola.
        Scanner pc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura a continuación");
        String nombre = pc.nextLine();
        System.out.println("Ingrese el color de la figura a continuación");
        String color = pc.nextLine();

        // Complejidad constante O(1), porque el switch case tiene un número de casos finito, y se
        //accede a estos a través del ingreso del nombre de la figura por medio de la consola.
        switch(nombre){
            // Los casos tienen complejidad constante O(1), al tener la creación de objetos de complejidad
            //O(1), asignación de valores por medio de la consola, e impresión de datos de complejidad O(1).
            case "Círculo" ->             {
                System.out.println("Ingrese el radio:");
                double radio = pc.nextDouble();
                Circulo fig1 = new Circulo(nombre, color, radio);
                System.out.println("El área del círculo es igual a " + fig1.obtenerArea(radio) + ". Y, el perímetro del círculo es igual a " + fig1.obtenerPerimetro(radio) + ".");
            break;
            }
            case "Rectángulo" ->             {
                System.out.println("Ingrese el lado 1:");
                double lado1 = pc.nextDouble();
                System.out.println("Ingrese el lado 2:");
                double lado2 = pc.nextDouble();
                Rectangulo fig2 = new Rectangulo(nombre, color, lado1, lado2);
                System.out.println("El área del rectángulo es igual a " + fig2.obtenerArea(lado1, lado2) + ". Y, el perímetro del rectángulo es igual a " + fig2.obtenerPerimetro(lado1, lado2) + ".");
            break;
            }
            case "Triángulo" -> {
                System.out.println("Ingrese la base del triángulo:");    
                double base = pc.nextDouble();
                System.out.println("Ingrese el perímetro del triángulo:");
                double altura = pc.nextDouble();
                Triangulo fig3 = new Triangulo(nombre, color, base, altura);
                System.out.println("El área del triángulo es igual a " + fig3.obtenerArea(base, altura)+ ". Y, el perímetro del triángulo es igual a " + fig3.obtenerPerimetrio(base, altura) + ".");
            }
        }
    }
}
