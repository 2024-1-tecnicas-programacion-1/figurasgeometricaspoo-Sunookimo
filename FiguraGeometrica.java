package herencia;

public class FiguraGeometrica {
    private String nombre;
    private String color;
    
    //Complejidad O(1) al realizar asignaciones de variables de forma simple.
    public FiguraGeometrica(String nombre, String color){
       this.nombre=nombre;
       this.color=color;
    }

    //Complejidad O(1), ya que los métodos no retornan nada al no realizar ninguna operación.
    public double obtenerArea(){ 
        return 0;   
    }
    public double obtenerPerimetro(){
        return 0;
    }
 
    //Los métodos getter & setter tienen una complejidad constante de O(1).
    public String getNombre() {
        return nombre;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
}