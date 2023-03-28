package Streams;

import java.util.Comparator;
import java.util.List;

public class SortingStream {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",10),
                new Movie("c",15),
                new Movie("d",20)
        );
        movies.stream()
                .sorted((a,b)-> a.getName().compareTo(b.getName()))
                .forEach(m-> System.out.println(m));

        movies.stream().sorted(Comparator.comparing(Movie::getName).reversed()).forEach(m-> System.out.println(m));
        movies.stream()
                .sorted(Comparator.comparing(m -> m.getName())).forEach(System.out::println);

    }
}
