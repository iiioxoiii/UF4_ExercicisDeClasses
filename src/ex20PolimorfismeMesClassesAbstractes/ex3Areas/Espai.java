package ex20PolimorfismeMesClassesAbstractes.ex3Areas;

public abstract class Espai {

    String id;
    Double superficie;
    Boolean llum;
    Double consumElectric;

    public Espai(String id, Double superficie, Boolean llum, Double consumElectric) {
        this.id = id;
        this.superficie = superficie;
        this.llum = llum;
        this.consumElectric = consumElectric;
    }

    public Double consumMetreQuadrat(){
        return consumElectric*superficie;
    }

    public Double espaiPerAlumne(){
        return superficie;
    }

}
