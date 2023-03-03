package movietheatre;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import moviebooking.MovieBookingController;
import moviedetails.Movie;
import moviedetails.Showtime;
 
 
public class MovieBookingView {
    private Scanner scanner;

    public MovieBookingView() {
        this.scanner = new Scanner(System.in);
    }

    public void showMovies(List<Movie> movies) {
        System.out.println("Available Movies:");
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println((i + 1) + ". " + movie.getTitle());
        }
    }

    public void showShowtimes(List<Showtime> showtimes) {
        System.out.println("Available Showtimes:");
        for (int i = 0; i < showtimes.size(); i++) {
            Showtime showtime = showtimes.get(i);
            System.out.println((i + 1) + ". " + showtime.getTime() + " (" + showtime.getAvailableSeats() + " seats available)");
        }
    }

    public int getSelectedMovieIndex() {
        System.out.print("Enter movie selection: ");
        return scanner.nextInt() - 1;
    }

    public int getSelectedShowtimeIndex() {
        System.out.print("Enter showtime selection: ");
        return scanner.nextInt() - 1;
    }

    public int getNumSeats() {
        System.out.print("Enter number of seats: ");
        return scanner.nextInt();
    }

    public String getCustomerName() {
        System.out.print("Enter customer name: ");
        return scanner.next();
    }
         public static void main(String[] args) {
            
            Movie movie1 = new Movie("Varisu", 142);
            movie1.addShowtime(new Showtime("10:00 AM", 100));
            movie1.addShowtime(new Showtime("1:00 PM", 100));
            movie1.addShowtime(new Showtime("4:00 PM", 100));
            movie1.addShowtime(new Showtime("7:00 PM", 100));

            Movie movie2 = new Movie("Vathi", 175);
            movie2.addShowtime(new Showtime("11:00 AM", 120));
            movie2.addShowtime(new Showtime("2:00 PM", 120));
            movie2.addShowtime(new Showtime("5:00 PM", 120));
            movie2.addShowtime(new Showtime("8:00 PM", 120));

            List<Movie> movies = new ArrayList<>();
            movies.add(movie1);
            movies.add(movie2);

             
            MovieBookingView view = new MovieBookingView();
            MovieBookingController controller = new MovieBookingController(movies, view);

             
            controller.start();
        }
    }


   