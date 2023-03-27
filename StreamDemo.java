package Streams;


import java.util.List;

public class StreamDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10),
                new Movie("b",15),
                new Movie("c",20)
        );
//        Impreative way
        int count1 = 0;
        for(var movie: movies)
            if(movie.getLikes()>10)
                count1++;
        System.out.println(count1);

//        Declarative Way
        var count2 = movies.stream().filter(movie -> movie.getLikes()>10).count();
        System.out.println(count2);


    }
}
