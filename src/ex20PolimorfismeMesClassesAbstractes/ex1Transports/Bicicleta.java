package ex20PolimorfismeMesClassesAbstractes.ex1Transports;


public class Bicicleta extends Transport {

    Integer marxes;

    public Bicicleta(String id, Double velocitat, Integer marxes) {
        super(id, velocitat);
        this.marxes = marxes;
    }

    @Override
    public Double preuPerDistancia(Double distancia) {
        System.out.println("El preu per distacia, en un ciclista, es pot determinar pel bon humor del ciclista");
        return null;
    }

}
