package ex16Herencia;

/**
 * En el cas de lloguer d’un cotxe, al preu base se li suma la quantitat de 1.5€ per plaça i
 * dia.
 */

public class Cotxe extends Vehicle{

    protected Integer places;
    protected Double suplementPaca = 1.5;
    protected Double suplementDia = 1.5;

    public Cotxe(String matricula, Integer diesLloguer, Integer places) {
        super(matricula, diesLloguer);
        this.places = places;
    }

    @Override
    public Double getPreuDia() {
        return getPreuBase()+ suplementDia + (suplementPaca * places);
    }

    @Override
    public Double getPreuTotal() {
        return getPreuDia()*getDiesLloguer();
    }
}
