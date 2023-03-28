package Streams;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ElementGrouping {
    public static void show(){
        List<MovieExtended> movies = List.of(
                new MovieExtended("a",10,Genre.THRILLER),
                new MovieExtended("b",15,Genre.ACTION),
                new MovieExtended("b",15,Genre.ACTION),
                new MovieExtended("c",20,Genre.ACTION)

        );
        Map<Genre,List<MovieExtended>> result =
                movies.stream().collect(Collectors.groupingBy(m->m.getGenre()));
        System.out.println(result);
        var result2 =
                movies.stream().collect(Collectors.groupingBy(MovieExtended::getGenre,Collectors.toSet()));
        var result3 =
                movies.stream().collect(Collectors.groupingBy(MovieExtended::getGenre,
                        Collectors.mapping(m -> m.getName(),Collectors.joining(","))));

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);


    }
}
