package ex20PolimorfismeMesClassesAbstractes.ex1Transports;

public class Cotxe extends Transport{

    String combustible;
    Double preuPerLitre;
    Double litresPerKm;

    public Cotxe(String id, Double velocitat, String combustible, Double preuPerLitre, Double litresPerKm) {
        super(id, velocitat);
        this.combustible = combustible;
        this.preuPerLitre = preuPerLitre;
        this.litresPerKm = litresPerKm;
    }


    @Override
    public Double preuPerDistancia(Double distancia) {
        return (litresPerKm*preuPerLitre)*distancia;
    }
}
