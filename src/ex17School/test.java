package ex17School;

import java.util.HashSet;

public class test {

    public static void main(String[] args) {

        HashSet<String> h =  new HashSet<>();
        h.add("poma");
        h.add("taronja");
        h.add("banana");

        Teacher t1 = new Teacher("Lola", "c/Gran de Gràcia", h);
        Person s1 = new Student("Lola", "c/Gran de Gràcia", "C3", 3);
        Person s2 = new InternationalStudent("Lluis", "c/Margarit", "C3", 3, "EEUU");

        t1.addSubject("cadira");
        t1.removeSubject("cadira");

    }

}
