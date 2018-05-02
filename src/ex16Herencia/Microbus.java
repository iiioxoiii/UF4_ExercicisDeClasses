package ex16Herencia;

public class Microbus extends Vehicle{

    Integer numPlaces;
    Double suplementPlaca = 2.0;

    public Microbus(String matricula, Integer diesLloguer, Integer numPlaces) {
        super(matricula, diesLloguer);
        this.numPlaces = numPlaces;
    }

    @Override
    public Double getPreuDia() {
        return getPreuBase()+(this.numPlaces*this.suplementPlaca);
    }

    @Override
    public Double getPreuTotal() {
        return getPreuDia()*getDiesLloguer();
    }
}
