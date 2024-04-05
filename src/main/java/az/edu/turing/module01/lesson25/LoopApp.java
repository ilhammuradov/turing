package az.edu.turing.module01.lesson25;

import java.util.Random;

public class LoopApp {

    public static void main(String[] args) {
        new Random()
                .ints()
                .limit(20)
                .forEach(System.out::println);
    }
}