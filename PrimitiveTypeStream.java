package Streams;

import java.util.stream.IntStream;

public class PrimitiveTypeStream {
    public static void show(){
        IntStream.range(1,10).forEach(System.out::println);
        IntStream.rangeClosed(1,10).forEach(System.out::println);
    }
}
