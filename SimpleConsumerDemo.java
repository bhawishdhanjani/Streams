package Streams;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SimpleConsumerDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",10),
                new Movie("c",15),
                new Movie("d",20)
        );
        long count = movies.stream().map(Movie::getLikes).filter(m->m>10).count();
        System.out.println("Count :"+ count);
        boolean anyMatch = movies.stream().anyMatch(m->m.getLikes()>10);
        System.out.println("Any Match >10 :"+anyMatch);
        boolean allMatch = movies.stream().allMatch(m->m.getLikes()>10);
        System.out.println("All Match >10 :"+allMatch);
        boolean noneMatch = movies.stream().noneMatch(m->m.getLikes()<2);
        System.out.println("None match <2 :" + noneMatch);
        Optional<Movie> findFirst = movies.stream().findFirst();
        System.out.println("Find First: "+findFirst);
        Optional<Movie> findAny = movies.stream().findAny();
        System.out.println("Find Any: "+findAny);
        Optional<Integer> maxLikes= movies.stream().map(Movie::getLikes)
                .max(Comparator.comparing(a -> a));
        System.out.println("Max Likes: " +maxLikes);
        movies.stream().sorted(Comparator.comparing(Movie::getName).reversed()).forEach(System.out::println);




    }
}