package ex1;

public class Cotxe {

    private String model;
    private String matricula;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        return "["+this.model+","+this.matricula+"]";
    }

}
