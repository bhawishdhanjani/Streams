package Streams;

public class Movie {
    private String name;
    private int likes;

    public Movie(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return name;
    }
}