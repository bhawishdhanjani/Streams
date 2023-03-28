package Streams;


import java.util.Objects;

public class MovieExtended extends Movie {
    private Genre genre;

    public MovieExtended(String name, int likes, Genre genre) {
        super(name, likes);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MovieExtended)
            return  (getLikes()-((MovieExtended) obj).getLikes())==0;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLikes());
    }

}
