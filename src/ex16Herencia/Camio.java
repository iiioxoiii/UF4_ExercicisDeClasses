package ex16Herencia;

public class Camio extends Vehicle{

    protected Double pma;
    protected Double suplementCamio = 20.0;

    public Camio(String matricula, Integer diesLloguer, Double pma) {
        super(matricula, diesLloguer);
        this.pma = pma;
    }

    @Override
    public Double getPreuDia() {
        return getPreuBase()+suplementCamio*pma;
    }

    @Override
    public Double getPreuTotal() {
        return getPreuDia()*getDiesLloguer() + 40.0;
    }


    public void setSuplementCamio(Double suplement){
        this.suplementCamio= suplement;
    }
}
