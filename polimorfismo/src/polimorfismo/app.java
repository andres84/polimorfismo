package polimorfismo;

public class app {

    public static void main(String[] args) {

        
        
        Animal a = new Perro("pastor aleman", "tintin", "carnivoro", 2);
        a.alimentarse();
        
        Animal a2 = new Caballo("veloz", "hervivoro", 4);
        a2.alimentarse();
        
        
        
    }
    
}
