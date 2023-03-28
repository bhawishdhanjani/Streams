package Streams;

import java.util.List;

public class GettingDistinctElement {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",10),
                new Movie("c",15),
                new Movie("d",20)
        );
     movies.stream().map(Movie::getLikes).distinct().forEach(System.out::println);
    }
}
