package Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collector {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",10),
                new Movie("c",15),
                new Movie("d",20)
        );
        List<Movie> popularMovies =movies.stream()
                .filter(movie -> movie.getLikes()>10)
                .collect(Collectors.toList());
        System.out.println(popularMovies);

        Map<String,Integer> hashMapOfMovies = movies.stream()
                .filter(movie -> movie.getLikes()>10)
                .collect(Collectors.toMap(m->m.getName(),m->m.getLikes()));
        System.out.println(hashMapOfMovies);

        Map<String,Movie> hashMapOfMovies2 = movies.stream()
                .filter(movie -> movie.getLikes()>10)
                .collect(Collectors.toMap(m->m.getName(), Function.identity()));
        System.out.println(hashMapOfMovies2);

        int sum =  movies.stream()
                .collect(Collectors.summingInt(m -> m.getLikes()));
        System.out.println(sum);

        var summarize = movies.stream()
                .collect(Collectors.summarizingInt(m -> m.getLikes()));
        System.out.println(summarize);

        var joining = movies.stream()
                .filter(m -> m.getLikes()>10)
                .map(m -> m.getName())
                .collect(Collectors.joining(","));
        System.out.println(joining);



    }
}
