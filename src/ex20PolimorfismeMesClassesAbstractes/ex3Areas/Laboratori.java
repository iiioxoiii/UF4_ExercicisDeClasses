package ex20PolimorfismeMesClassesAbstractes.ex3Areas;

public class Laboratori extends Espai{

    Integer encenedors;

    public Laboratori(String id, Double superficie, Boolean llum, Double consumElectric, Integer encenedors) {
        super(id, superficie, llum, consumElectric);
        this.encenedors = encenedors;
    }
}
