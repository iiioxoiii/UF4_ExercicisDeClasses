package ex18Biblioteca;

public class Obra extends Fitxa {

    protected String autor;
    protected short nrePags;

    public Obra(String titol, String referencia, String autor, short nrePags) {
        super(titol, referencia);
        this.autor = autor;
        this.nrePags = nrePags;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getNrePags() {
        return nrePags;
    }

    public void setNrePags(short nrePags) {
        this.nrePags = nrePags;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "autor='" + autor + '\'' +
                ", nrePags=" + nrePags +
                ", titol=" + titol.toString() +
                ", referencia=" + referencia.toString() +
                '}';
    }
}
