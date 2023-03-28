package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class PartitioningElement {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",10),
                new Movie("c",15),
                new Movie("d",20)
        );
        var famousMovies = movies.stream().
                collect(Collectors.partitioningBy(m->m.getLikes()>10));
        var famousMovies2 = movies.stream()
                .collect(Collectors.partitioningBy(
                        movie -> movie.getLikes()>10,
                        Collectors.mapping(m->m.getName(),
                                Collectors.toList())));

        System.out.println(famousMovies);
        System.out.println(famousMovies2);

    }
}
