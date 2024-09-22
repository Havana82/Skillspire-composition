import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        director and Actor class instances
        Director titanicDirector = new Director("James Cameron", 41);
        Actor titanicActor = new Actor("Jack", 34);
        System.out.println(titanicDirector.getName());
        System.out.println(titanicActor.getName());


//        Media class instance
        ArrayList<Actor> cast = new ArrayList<>();
        cast.add(titanicActor);
        cast.add(new Actor("Rose", 24));
        cast.add(new Actor("Freddie", 64));

        Media media = new Media("The Titanic", "PG",titanicDirector, cast);
        System.out.println(media.getCast());
        System.out.println(media.getDirector().getName());

//        Movie class instance
        Movie movie = new Movie("Forest Gump", "PG", new Director("Robert Zemekis", 65), cast,
                2, "A large ship that sinks", 3.5);
        System.out.println(movie.getTitle());
        System.out.println(movie.getDirector().getAge());

//        TvShow class instance
        TvShow tvShow = new TvShow("Friends", "PG", new Director("James Burrows",32), cast, 10, 155);
        System.out.println(tvShow.getTitle());
        System.out.println(tvShow.getDirector().getName());
        System.out.println(tvShow.getEpisodes());
    }
}