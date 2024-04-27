package az.edu.turing.module01.lesson30;

import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingApp {

    public static void main(String[] args) {
        new Random()
                .ints(10, 0, 20)
                .peek(num -> System.out.printf("%d ", num))
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + ":" + value));

        System.out.println();


        new Random()
                .ints(13,0,30)
                .peek(num-> System.out.printf("%d ",num))
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((key,value)->System.out.println(key+":"+value));





    }
}
