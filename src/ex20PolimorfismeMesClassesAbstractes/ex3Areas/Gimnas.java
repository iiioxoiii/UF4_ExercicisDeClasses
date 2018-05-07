package ex20PolimorfismeMesClassesAbstractes.ex3Areas;

public class Gimnas extends Espai{

    Boolean dutxes;
    Integer grades;

    public Gimnas(String id, Double superficie, Boolean llum, Double consumElectric, Boolean dutxes, Integer grades) {
        super(id, superficie, llum, consumElectric);
        this.dutxes = dutxes;
        this.grades = grades;
    }

    @Override
    public Double espaiPerAlumne() {
        return super.espaiPerAlumne()+grades;
    }
}
