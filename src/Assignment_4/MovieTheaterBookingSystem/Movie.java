package Assignment_4.MovieTheaterBookingSystem;

import java.util.Scanner;

public class Movie {

    private String mName;
    private String show;
    private double tPrice;

    public String getmName ( ) {
        return mName;
    }

    public void setmName ( String mName ) {
        this.mName = mName;
    }

    public String getShow ( ) {
        return show;
    }

    public void setShow ( String show ) {
        this.show = show;
    }

    public double gettPrice ( ) {
        return tPrice;
    }

    public void settPrice ( double tPrice ) {
        this.tPrice = tPrice;
    }

    Movie ( String mName , String show , double tPrice ) {
        this.mName = mName;
        this.show = show;
        this.tPrice = tPrice;
    }
}
