package polimorfismo;

public class Caballo extends Animal {

    public Caballo(String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
    }

    @Override
    public void alimentarse() {
        
        System.out.println("me alimento de hiervas");
        
    }


    
}
