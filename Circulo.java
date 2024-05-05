package herencia;
 
public class Circulo extends FiguraGeometrica {
    private double radio;
    
    //Complejidad O(1) al realizar asignaciones de variables de forma simple.
    public Circulo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio=radio;
    }

    //Complejidad O(1) al realizar operaciones de asignación y multiplicaciones.
    public double obtenerArea(double radio){
        double operacion = radio * radio * Math.PI;
        return operacion; 
    }
    
    //Complejidad O(1) al realizar operaciones de asignación y multiplicaciones.
    public double obtenerPerimetro(double radio){
        double operacion1 = radio * 2 * Math.PI;
        return operacion1;
    }
 
    //Los métodos getter & setter tienen una complejidad constante de O(1).
    public double getRadio() {
        return radio;
    }
 
    public void setRadio(double radio) {
        this.radio = radio;
    }
}