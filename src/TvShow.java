import java.util.ArrayList;

public class TvShow extends Media {
    private  int season;
    private int episodes;

    TvShow(String title, String rating, Director director,
           ArrayList<Actor> cast, int season, int episodes){
        super(title, rating, director, cast);
        this.season = season;
        this.episodes = episodes;
    }

    public int getSeason(){
        return season;
    }

    public int getEpisodes(){
        return episodes;
    }

    public void setSeason(int season){
        this.season = season;
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

}

