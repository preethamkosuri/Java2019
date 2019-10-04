package M6.BookYourShow;

import java.util.Arrays;

class BookYourShow {
    private String Theatre, Moviename,Time;
    int Price;
    int[][] Seats;
    
    public BookYourShow(String theatre, String moviename, String time, int price, int[][] seats) {
        Theatre = theatre;
        Moviename = moviename;
        Price = price;
        Time = time;
        Seats = seats;
    }

    public String getTheatre() {
        return Theatre;
    }

    public void setTheatre(String theatre) {
        Theatre = theatre;
    }

    public String getMoviename() {
        return Moviename;
    }

    public void setMoviename(String moviename) {
        Moviename = moviename;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public int[][] getSeats() {
        return Seats;
    }

    public void setSeats(int[][] seats) {
        Seats = seats;
    }

    @Override
    public String toString() {
        return "BookYourShow [Moviename=" + Moviename + ", Price=" + Price + ", Seats=" + Arrays.toString(Seats)
                + ", Theatre=" + Theatre + ", Time=" + Time + "]";
    }
    
}