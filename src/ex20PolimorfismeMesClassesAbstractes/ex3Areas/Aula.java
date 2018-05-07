package ex20PolimorfismeMesClassesAbstractes.ex3Areas;

public class Aula extends Espai {

    Integer aforament;
    Boolean cadiresPala;
    Integer numOrdinadors;
    Boolean connectorsXarxa;


    public Aula(String id, Double superficie, Boolean llum, Double consumElectric, Integer aforament, Boolean cadiresPala, Integer numOrdinadors, Boolean connectorsXarxa) {
        super(id, superficie, llum, consumElectric);
        this.aforament = aforament;
        this.cadiresPala = cadiresPala;
        this.numOrdinadors = numOrdinadors;
        this.connectorsXarxa = connectorsXarxa;
    }

}

