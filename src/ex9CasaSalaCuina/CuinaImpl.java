package ex9CasaSalaCuina;

public class CuinaImpl implements Cuina{

    boolean EsIndepent;
    int NombreFogons;


    public CuinaImpl(){
        this.EsIndepent = false;
        this.NombreFogons = 0;
    }


    public boolean getEsIndepent() {
        return false;
    }

    public boolean getNombreDeFogons() {
        return false;
    }

    public void setEsIndependent(boolean i) {
        this.EsIndepent = i;
    }

    public void setNombreDeFogons(int n) {
        this.NombreFogons = n;
    }

    @Override
    public String toString() {
        return "CuinaImpl{" +
                "EsIndepent=" + EsIndepent +
                ", NombreFogons=" + NombreFogons +
                '}';
    }
}
