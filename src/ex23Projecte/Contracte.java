package ex23Projecte;

import java.util.Date;

public class Contracte {

    Date dataInici;
    Date dataFi;
    Double sou;


    public Contracte(Date dataInici, Double sou) {
        this.dataInici = dataInici;
        this.dataFi = null;
        this.sou = sou;
    }

    public Double getSou() {
        return sou;
    }

    public void setSou(Double sou) {
        this.sou = sou;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataFi() {
        return dataFi;
    }

    public void setDataFi(Date dataFi) {
        this.dataFi = dataFi;
    }

    @Override
    public String toString() {

        //dateFormat

        return "Contracte{" +
                "dataInici=" + dataInici +
                ", dataFi=" + dataFi +
                ", sou=" + sou +
                '}';
    }
}
