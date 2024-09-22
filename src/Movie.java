import java.util.ArrayList;

public class Movie extends Media {

    private int length;
    private String description;
    private double grossing;

    Movie(String title, String rating, Director director,
          ArrayList<Actor> cast, int length, String description, double grossing){
        super(title, rating, director, cast);
        this.length = length;
        this.description = description;
        this.grossing = grossing;
    }

    public int getLength() {
        return length;
    }

    public String getDescription(){
        return description;
    }

    public double getGrossing(){
        return grossing;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setGrossing(double grossing){
        this.grossing = grossing;
    }
}

