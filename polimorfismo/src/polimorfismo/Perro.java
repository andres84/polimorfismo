
package polimorfismo;


public class Perro extends Animal{
    
    
    private String raza;

    public Perro(String raza, String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar() {

        System.out.println(getNombre() + "-" + getTipo_alimentacion() + "-" + getEdad() + "-" + getRaza());

    }

    @Override
    public void alimentarse() {
        System.out.println("me alimento de carne");
    }
    
    
}
