package ex11FerriesCamions;

public class CamioImpl {

    private String matricula;
    private double pes;

    public CamioImpl(String matricula, double pes) {
        this.matricula = matricula;
        this.pes = pes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
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
