package herencia;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
 
    //Complejidad O(1) al realizar asignaciones de variables de forma simple.
    public Triangulo(String nombre, String color, double base, double altura){
        super(nombre, color);
        this.base = base;
        this.altura=altura;
    }
    
    //Complejidad O(1) al realizar operaciones de asignación, multiplicaciones, y división de productos.
    public double obtenerArea(double base, double altura){
        double op = (base * altura)/2;
        return op;
    }
    
    //Complejidad O(1) al realizar operaciones de asignación, multiplicaciones, suma de productos, 
    //sumas, y aplicaciones de raíces cuadradas a través de la función "sqrt", que optimiza el tiempo
    //de resultados.
    public double obtenerPerimetrio(double base, double altura){
        double op2 = Math.sqrt(base*base + altura*altura);
        double op4 = base + altura + op2;
        return op4;
    }

    //Los métodos getter & setter tienen una complejidad constante de O(1).
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}