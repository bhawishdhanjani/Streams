package Streams;
import java.util.List;

public class PeekingElement {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",10),
                new Movie("c",15),
                new Movie("d",20)
        );
        movies.stream().filter(m->m.getLikes()>10)
                .peek(m-> System.out.println("filtered: "+m))
                .map(movie -> movie.getName())
                .peek(m-> System.out.println("mapped: "+m))
                .forEach(m-> System.out.println(m));
    }
}
