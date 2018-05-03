package ex17School;

public class InternationalStudent extends Student {
    private String country;

    public InternationalStudent(String name, String address, String cicle, int course, String country) {
        super(name, address, cicle, course);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
