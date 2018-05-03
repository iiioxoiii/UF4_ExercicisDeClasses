package ex17School;

public class Student extends Person{

    private String cicle;
    private int course;

    protected Student(String name, String address, String cicle, int course) {
        super(name, address);
        this.cicle = cicle;
        this.course = course;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
