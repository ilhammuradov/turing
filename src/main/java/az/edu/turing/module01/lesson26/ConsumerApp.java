package az.edu.turing.module01.lesson26;

import java.util.function.Consumer;

public class ConsumerApp {

    public static void main(String[] args) {
        Consumer<Student> studentConsumer = student -> System.out.println(student.toString());
        Consumer<Student> studentConsumer2 = System.out::println;

        studentConsumer.accept(new Student(1, 1, "1"));
    }
}