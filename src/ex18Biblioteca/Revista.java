package ex18Biblioteca;

public class Revista {

    private short any;
    private short nro;


    public Revista(short any, short nro) {
        this.any = any;
        this.nro = nro;
    }

    public short getAny() {
        return any;
    }

    public void setAny(short any) {
        this.any = any;
    }

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "any=" + any +
                ", nro=" + nro +
                '}';
    }
}
