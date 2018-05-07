package ex20PolimorfismeMesClassesAbstractes.ex3Areas;

public class Informatica extends Espai {

    Integer numImpressores;

    public Informatica(String id, Double superficie, Boolean llum, Double consumElectric, Integer numImpressores) {
        super(id, superficie, llum, consumElectric);
        this.numImpressores = numImpressores;
    }

    @Override
    public Double espaiPerAlumne() {
        return super.espaiPerAlumne()-numImpressores;
    }
}
