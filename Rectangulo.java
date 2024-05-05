package herencia;
 
public class Rectangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;

    //Complejidad O(1) al realizar asignaciones de variables de forma simple.
    public Rectangulo(String nombre, String color, double lado1, double lado2){
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Complejidad O(1) al realizar operaciones de asignación y multiplicaciones.
    public double obtenerArea(double lado1, double lado2){
       double operacion3 = lado1 * lado2;
       return operacion3;
    }

    //Complejidad O(1) al realizar operaciones de asignación, multiplicaciones, y suma de productos.
    public double obtenerPerimetro(double lado1, double lado2){
       double operacion4 = lado1*2 + lado2*2;
       return operacion4;
    }
 
    //Los métodos getter & setter tienen una complejidad constante de O(1).
    public double getLado1() {
        return lado1;
    }
 
    public double getLado2() {
        return lado2;
    }
 
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
 
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}