package ex21Interficies.ex1Cantant;

public class Persona implements Cantant{

    String nom;
    Integer edad;

    public Persona(String nom, Integer edad) {
        this.nom = nom;
        this.edad = edad;
    }

    @Override
    public void canta() {
        System.out.println("El "+ this.nom + "canta cançons religioses");
    }
}
