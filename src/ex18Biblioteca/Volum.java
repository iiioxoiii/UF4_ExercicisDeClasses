package ex18Biblioteca;

public class Volum extends Obra {

    private short nro;

    public Volum(String titol, String referencia, String autor, short nrePags, short nro) {
        super(titol, referencia, autor, nrePags);
        this.nro = nro;
    }

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Volum{" +
                "autor='" + autor+
                ", nrePags=" + nrePags +
                ", titol=" + titol +
                ", referencia=" + referencia +
                ", nro=" + nro +
                '}';
    }
}
