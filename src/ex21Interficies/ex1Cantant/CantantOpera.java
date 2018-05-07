package ex21Interficies.ex1Cantant;

public class CantantOpera extends Persona {

    public CantantOpera(String nom, Integer edad) {
        super(nom, edad);
    }

    @Override
    public void canta() {
        System.out.println("El cantant d'opera és una estrella de la lírica");;
    }
}
