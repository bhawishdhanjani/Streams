package Streams;

import java.util.List;
import java.util.function.Predicate;

public class FilteringElements {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",10),
                new Movie("c",15),
                new Movie("d",20)
        );
        Predicate<Movie> isPopular = movie -> movie.getLikes()>10;
        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie));

    }
}
