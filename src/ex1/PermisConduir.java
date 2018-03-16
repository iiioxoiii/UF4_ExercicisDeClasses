package ex1;

public class PermisConduir {

    private String nom;
    private String tipusPermis;
    private int punts;



    public PermisConduir(){}

    public PermisConduir(int punts){
        this.punts=punts;
    }



    public void imprimirPermis(PermisConduir o){
        System.out.println(o.toString());
    }

    public void restarPunts (int punts){
        this.punts = this.punts - punts;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipusPermis() {
        return tipusPermis;
    }

    public void setTipusPermis(String tipusPermis) {
        this.tipusPermis = tipusPermis;
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public String toString(){
        return "["+ this.nom+","+this.tipusPermis+","+this.punts+"]";
    }
}
