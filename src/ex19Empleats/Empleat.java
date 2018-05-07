package ex19Empleats;

public class Empleat {

    protected String nom;
    protected String cognom;
    protected Integer edat;
    protected Double salari;

    public Empleat(String nom, String cognom, Integer edat, Double salari) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.salari = salari;
    }


    boolean plus(int plusSalarial){

        boolean mereixPlus = false;

        if(edat > 40){
            this.salari = this.salari + plusSalarial;
            mereixPlus = true;
        }

        return mereixPlus;
    }

    boolean comprovaNom(){
       return nom.isEmpty();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public Integer getEdat() {
        return edat;
    }

    public void setEdat(Integer edat) {
        this.edat = edat;
    }

    public Double getSalari() {
        return salari;
    }

    public void setSalari(Double salari) {
        this.salari = salari;
    }


    @Override
    public String toString() {
        return "Empleat{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                ", salari=" + salari +
                '}';
    }
}
