package service.impl;

import client.db.moviedata.MovieDataDBClient;
import model.Movie;
import model.Show;
import model.Theater;
import service.MovieManagerSevice;

import java.util.List;

public class MovieManagerSeviceImpl implements MovieManagerSevice {
    private final MovieDataDBClient movieDataDBClient;

    public MovieManagerSeviceImpl(MovieDataDBClient movieDataDBClient) {
        this.movieDataDBClient = movieDataDBClient;
    }

    @Override
    public void addMovie(String city, Show show) {
        //movieDataDBClient.addMovieShow(city,show);
    }

    @Override
    public void addMovieByCity(Show show, List<String> cities) {
        //movieDataDBClient.addMovieShowByCity(cities,show);
    }

    @Override
    public boolean deleteMovie(Show show, String city) {
        return false;
    }

//    @Override
//    public boolean deleteMovieByCity(Movie movie, List<String> cities) {
//        return false;
//    }
//
//    @Override
//    public boolean updateMovie(Movie movie, String city, Theater theater) {
//        return false;
//    }
//
//    @Override
//    public boolean updateMovieByCity(Movie movie, List<String> cities) {
//        return false;
//    }
}
