package Streams;

import Generics.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){
        var list = new ArrayList<Integer>();
        list.stream();
//        Array Stream
        int[] numbers = {1 ,2 ,3};
        Arrays.stream(numbers).forEach(n-> System.out.println(n));
//        Stream of arbitrary number of object
        var stream1 = Stream.of(1,2,3);
        stream1.forEach(n-> System.out.println(n));

//        Generating Infinite Stream
        var stream2 = Stream.generate(()->Math.random());
        stream2.limit(10).forEach(n-> System.out.println(n));
//        Using iterate method creating stream
        var stream3 = Stream.iterate(1,(n -> n+1));
        stream3.limit(10).forEach(n-> System.out.println(n));
    }
}
