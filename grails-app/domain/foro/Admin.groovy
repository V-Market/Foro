package foro

/**
 * Created by Neill Rolando Giraldo
 */

public class Admin{

    int level;
    double rating;

    public Admin(int level, double rating){
        this.level = level;
        this.rating = rating;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLever(){
        return this.level;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating(){
        return rating;
    }
}
