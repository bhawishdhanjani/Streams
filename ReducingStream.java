package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReducingStream {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",10),
                new Movie("c",15),
                new Movie("d",20)
        );
        Optional<Integer> sumOfLikes = movies.stream()
                .map(m -> m.getLikes())
                .reduce(Integer::sum);
        System.out.println(sumOfLikes.get());
        int sumOfLikes2 = movies.stream()
                .map(m -> m.getLikes())
                .reduce((a,b)->a+b).orElse(0);
        System.out.println(sumOfLikes2);

    }
}
