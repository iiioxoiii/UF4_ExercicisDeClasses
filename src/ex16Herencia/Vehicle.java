package ex16Herencia;

public abstract class Vehicle {

    private String matricula;
    private Double preuBase = 10.00;
    private Integer diesLloguer;


    public Vehicle(String matricula, Integer diesLloguer) {
        this.matricula = matricula;
        this.diesLloguer = diesLloguer;
    }

    public abstract Double getPreuDia();

    public abstract Double getPreuTotal();


    public String getMatricula() {
        return matricula;
    }

    public Double getPreuBase() {
        return preuBase;
    }

    public Integer getDiesLloguer() {
        return diesLloguer;
    }
}
