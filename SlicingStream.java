package Streams;

import java.util.List;

public class SlicingStream {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",20),
                new Movie("c",15),
                new Movie("b",10),
                new Movie("d",20)
        );
        System.out.println("Limit Method");
        movies.stream()
                .limit(2)
                .forEach(m-> System.out.println(m));
        System.out.println("Skip Method");
        movies.stream()
                .skip(2)
                .forEach(m-> System.out.println(m));
        System.out.println("Take While");
        movies.stream()
                .takeWhile(m->m.getLikes()>10)
                .forEach(m-> System.out.println(m));
        System.out.println("Using Drop While");
        movies.stream()
                .dropWhile(m->m.getLikes()>=15)
                .forEach(m-> System.out.println(m));

    }
}
