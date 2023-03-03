package moviedetails;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int duration;
    private List<Showtime> showtimes;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
        this.showtimes = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public List<Showtime> getShowtimes() {
        return showtimes;
    }

    public void addShowtime(Showtime showtime) {
        showtimes.add(showtime);
    }
}