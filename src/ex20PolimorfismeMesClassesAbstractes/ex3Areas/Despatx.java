package ex20PolimorfismeMesClassesAbstractes.ex3Areas;

public class Despatx extends Espai {

    Integer numTaules;
    Boolean maquinaCafe;

    public Despatx(String id, Double superficie, Boolean llum, Double consumElectric, Integer numTaules, Boolean maquinaCafe) {
        super(id, superficie, llum, consumElectric);
        this.numTaules = numTaules;
        this.maquinaCafe = maquinaCafe;
    }
}
