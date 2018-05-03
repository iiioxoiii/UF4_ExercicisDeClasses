package ex17School;

import java.util.HashSet;

public class Teacher extends Person {
    private HashSet <String> subjects;

    public Teacher(String name, String address, HashSet<String> subjects) {
        super(name, address);
        this.subjects = subjects;
    }

    public boolean addSubject(String subject){
        boolean sortida = false;

        if (this.subjects.add(subject)){
            sortida = true;
            return sortida;
        }else{
            sortida = false;
            return sortida;
        }
    }

    public boolean removeSubject(String subject) {

        boolean sortida = false;

        for (String s : subjects) {
            if (s.equals(subject)) {
                subjects.remove(s);
                sortida = true;
                return sortida;
            }
        }

    return sortida;

    }

}

