package ex18Biblioteca;

public class Fitxa {

    protected String titol;
    protected String referencia;

    public Fitxa(){}

    public Fitxa(String titol, String referencia) {
        this.titol = titol;
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    @Override
    public boolean equals(Object o) {

        boolean sortida = false;

       if(o instanceof Fitxa){

           Fitxa f = (Fitxa) o;

           if (this.referencia.equals(f.getReferencia())){
               sortida = true;
           }else{
               sortida = false;
           }
       }

       return sortida;
    }


    @Override
    public String toString() {
        return "Fitxa{" +
                "titol='" + titol + '\'' +
                ", referencia='" + referencia + '\'' +
                '}';
    }
}
