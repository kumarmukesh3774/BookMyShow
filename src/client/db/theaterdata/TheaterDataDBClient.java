package client.db.theaterdata;

import client.db.enums.BookingStatus;
import client.db.enums.City;
import client.db.enums.SeatClass;
import client.db.moviedata.MovieDataDBClient;
import model.Movie;
import model.Seat;
import model.Show;
import model.Theater;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterDataDBClient {
    Map<String, List<Theater>> showsById =  new HashMap<>();

    Map<City,List<Theater>> theaterByCity = new HashMap<>();

    public void loadTheaterData(MovieDataDBClient movieDataDBClient){

        List<Theater> thList = new ArrayList<>();
        Theater thShow = null;
        for(City city : City.values()) {
            List<Movie> movies = movieDataDBClient.getMovieByCity(city);
            for (Movie movie : movies) {

                thShow = new Theater("PVR Nexus", new Show(movie, LocalDateTime.of(2025, 5, 25, 15, 30, 00),getSeats()));
                thList.add(thShow);
                thShow = new Theater("PVR Nexus", new Show(movie, LocalDateTime.of(2025, 5, 25, 18, 30, 00),getSeats()));
                thList.add(thShow);
                thShow = new Theater("Inox Phonix", new Show(movie, LocalDateTime.of(2025, 5, 25, 15, 30, 00),getSeats()));
                thList.add(thShow);
                thShow = new Theater("Inox Phonix", new Show(movie, LocalDateTime.of(2025, 5, 25, 18, 30, 00),getSeats()));
                thList.add(thShow);
            }
            theaterByCity.put(city, thList);
        }
    }
    public List<Seat> getSeats(){
        List<Seat> seats =  new ArrayList<>();
        for(int i = 1 ;i<=5;i++){
            seats.add(new Seat(i, SeatClass.NORMAL,250l,1, BookingStatus.AVAILABLE));
        }
        for(int i = 6 ;i<=10;i++){
            seats.add(new Seat(i, SeatClass.PREMIUM,350l,2,BookingStatus.AVAILABLE));
        }
        for(int i = 11 ;i<=15;i++){
            seats.add(new Seat(i, SeatClass.DELUX,450l,3, BookingStatus.AVAILABLE));
        }
        return seats;
    }
    public List<Theater> getTheaterByMovie(Movie movie,City city){
        return theaterByCity.get(city).stream()
                .filter(th->th.show().movie().name().contains(movie.name())).toList();
    }

}
