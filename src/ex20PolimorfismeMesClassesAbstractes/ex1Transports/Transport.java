package ex20PolimorfismeMesClassesAbstractes.ex1Transports;

public abstract class Transport {

    String id;
    Double velocitat;

    public Transport(String id, Double velocitat) {
        this.id = id;
        this.velocitat = velocitat;
    }

    public Double horesEnRecorrer(Double distancia) {
        return distancia / velocitat;
    }

    public abstract Double preuPerDistancia(Double distancia);

}
