package ex21Interficies.ex1Cantant;

public class Canari implements Cantant {

    String color;
    String pais;

    public Canari(String color, String pais) {
        this.color = color;
        this.pais = pais;
    }

    @Override
    public void canta() {
        System.out.println("El pardal canta com un ocell");
    }
}
