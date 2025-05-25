package service.impl;

import client.db.enums.BookingStatus;
import client.db.enums.City;
import client.db.moviedata.MovieDataDBClient;
import client.db.theaterdata.TheaterDataDBClient;
import model.Movie;
import model.Seat;
import model.Show;
import model.Theater;
import service.BookMyShowApplicationService;

import java.util.List;
import java.util.Scanner;

public class BookMyShowApplicationServiceImpl implements BookMyShowApplicationService {

    Scanner sc = null;
    private MovieDataDBClient movieDataDBClient;
    private TheaterDataDBClient theaterDataDBClient;
    private TicketSeviceImpl ticketSeviceImpl;
    private static BookMyShowApplicationServiceImpl bookMyShowApplicationServiceImpl = null;

    public static BookMyShowApplicationServiceImpl getInstance() {
        if(bookMyShowApplicationServiceImpl ==null){
            bookMyShowApplicationServiceImpl = new BookMyShowApplicationServiceImpl();
        }
        return bookMyShowApplicationServiceImpl;
    }

    @Override
    public void initiallize() {
        sc = new Scanner(System.in);
        this.movieDataDBClient = new MovieDataDBClient();
        movieDataDBClient.loadMovieData();
        this.theaterDataDBClient = new TheaterDataDBClient();
        theaterDataDBClient.loadTheaterData(movieDataDBClient);
        ticketSeviceImpl = new TicketSeviceImpl();

    }

    private void loadBMSHeader(String header) {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("          " + header);
        System.out.println("══════════════════════════════════════════\n");
    }

    @Override
    public void startBooking() {
        loadBMSHeader("🎬 Welcome to BookMyShow 🎟️");
        boolean keepBooking = true;
        while(keepBooking){
            City city = selectCity();
            List<Movie> moviesByCity = movieDataDBClient.getMovieByCity(city);
            Movie movie = selectMovie(moviesByCity);
            List<Theater> thList = theaterDataDBClient.getTheaterByMovie(movie,city);
            Theater th = selectTheaterAndShow(thList);
            Seat seat = selectSeat(th);
            ticketSeviceImpl.bookTicket(th.show(),seat);

            System.out.println("    Wan to book another ticket ?    ");
            System.out.println("Enter\n 1: Yes \n 2: No ");
            int option = getUserChoice(1,2);
            if(option == 2){
                keepBooking = false;
            }
        }
    }

    private Seat selectSeat(Theater th) {
        System.out.println("    Please select a show in Theater  "+ th.name());
        List<Seat> seats = th.show().seats();
        for(int i=0;i<seats.size();i++){
            Seat seat = seats.get(i);
            if(!seat.getStatus().equals(BookingStatus.BOOKED)) {
                System.out.println((i + 1) + " row " + seat.getRow() + " class " + seat.getSeatType() + " Amount " + seat.getRate());
            }
        }
        return seats.get(getUserChoice(1,seats.size())-1);
    }

    private Theater selectTheaterAndShow(List<Theater> thList) {
        System.out.println("    Please select a Theater   ");
        for(int i=0;i<thList.size();i++){
            System.out.println((i+1)+"  "+thList.get(i).name()+" time  " + thList.get(i).show().dateTime());
        }
        return thList.get(getUserChoice(1,thList.size())-1);
    }

    private Movie selectMovie(List<Movie> moviesByCity) {
        System.out.println("    Please select a movie   ");
        for(int i=0;i<moviesByCity.size();i++){
            System.out.println((i+1)+"  "+moviesByCity.get(i).name());
        }
        return moviesByCity.get(getUserChoice(1,moviesByCity.size())-1);
    }

    private City selectCity() {
        System.out.println("Please select a city");
        for(City city : City.values()){
            System.out.println("    "+( city.ordinal()+1)+"   "+city );
        }
        return City.values()[getUserChoice(1, City.values().length) - 1];
    }

    private int getUserChoice(int min, int max) {
        int choice = -1;
        do{
            System.out.print("👉 Enter choice (" + min + "-" + max + "): ");
            while (!sc.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.");
                sc.next();
            }
            choice = sc.nextInt();
        } while (choice < min || choice > max);
        return choice;
    }


}
