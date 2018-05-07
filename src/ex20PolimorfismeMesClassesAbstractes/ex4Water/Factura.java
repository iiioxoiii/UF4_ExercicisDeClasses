package ex20PolimorfismeMesClassesAbstractes.ex4Water;

public class Factura {

    Integer consum;
    Double sanejament;
    Double residuals;
    Double descompteSanejament;
    Double descompteResiduals;


    public Factura(Integer consum, Double sanejament, Double residuals, Double descompteSanejament, Double descompteResiduals) {
        this.consum = consum;
        this.sanejament = sanejament;
        this.residuals = residuals;
        this.descompteSanejament = descompteSanejament;
        this.descompteResiduals = descompteResiduals;
    }

    public Integer getConsum() {
        return consum;
    }

    public void setConsum(Integer consum) {
        this.consum = consum;
    }

    public Double getSanejament() {
        return sanejament;
    }

    public void setSanejament(Double sanejament) {
        this.sanejament = sanejament;
    }

    public Double getResiduals() {
        return residuals;
    }

    public void setResiduals(Double residuals) {
        this.residuals = residuals;
    }

    public Double getDescompteSanejament() {
        return descompteSanejament;
    }

    public void setDescompteSanejament(Double descompteSanejament) {
        this.descompteSanejament = descompteSanejament;
    }

    public Double getDescompteResiduals() {
        return descompteResiduals;
    }

    public void setDescompteResiduals(Double descompteResiduals) {
        this.descompteResiduals = descompteResiduals;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "sanejament=" + sanejament +
                ", residuals=" + residuals +
                ", descompteSanejament=" + descompteSanejament +
                ", descompteResiduals=" + descompteResiduals +
                '}';
    }
}
