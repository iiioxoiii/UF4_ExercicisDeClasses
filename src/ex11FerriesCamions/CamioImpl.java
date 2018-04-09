package ex11FerriesCamions;

public class CamioImpl implements Camio{

    private String matricula;
    private Double pes;

    public CamioImpl(String matricula, Double pes) {
        this.matricula = matricula;
        this.pes = pes;
    }

    public CamioImpl(String matricula){
        this.matricula = matricula;
        this.pes = 0.0;
    }

    public CamioImpl(Double pes){
        this.matricula = "ZZZ-00000";
        this.pes = pes;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getPes() {
        return pes;
    }

    public void setPes(Double pes) {
        this.pes = pes;
    }


    @Override
    public boolean equals(Object o) {
        boolean r = false;

        if(o instanceof Camio){
            Camio c = (Camio) o;
            r = this.matricula.equals(c.getMatricula());
        }

        return r;
    }

    @Override
    public String toString() {
        return "Camio{" +
                "matricula='" + matricula + '\'' +
                ", pes=" + pes +
                '}';
    }
}
