package az.edu.turing.module01.lesson26;

import java.util.Comparator;

public class FunctionalInterfacesApp {

    public static void main(String[] args) {
        Student nrln = new Student(19, 51.3, "Nrln");
        Student bashirTheBEST = new Student(19, 100, "Bshr");
        Student bhrz = new Student(30, 52.3, "Bhrz");

        Comparator<Student> studentComparator = Comparator.comparingDouble(s -> s.grade);

        System.out.println(studentComparator.compare(nrln, bashirTheBEST));
        System.out.println(studentComparator.compare(bhrz, bashirTheBEST));

        Comparator<Student> studentComparator2 = (s1, s2) -> {
            return Double.compare(s1.grade, s2.grade);
        };
        System.out.println(studentComparator2.compare(nrln, bashirTheBEST));
        System.out.println(studentComparator2.compare(bhrz, bashirTheBEST));
    }

}