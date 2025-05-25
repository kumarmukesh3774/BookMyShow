package service.impl;

import client.db.enums.City;
import client.db.enums.Genre;
import client.db.enums.Language;
import client.db.moviedata.MovieDataDBClient;
import model.Movie;
import model.Order;
import model.User;
import service.MovieCatalogueSevice;

import java.util.List;

public class MovieCatalogueServiceImpl implements MovieCatalogueSevice {

    private final MovieDataDBClient movieDataDBClient;

    public MovieCatalogueServiceImpl(MovieDataDBClient movieDataDBClient){
        this.movieDataDBClient = movieDataDBClient;
    }
    @Override
    public List<Movie> getMoviesByCity(City city) {
        return movieDataDBClient.getMovieByCity(city);
    }

    @Override
    public List<Movie> getMoviesByLanguage(Language lang) {
        return movieDataDBClient.getMovieByLanguage(lang);
    }

    @Override
    public List<Movie> getMoviesByGenre(Genre genre) {
        return movieDataDBClient.getMovieByGenre(genre);
    }

    @Override
    public List<Order> getOrderHistory(User user) {
        return null;
    }
}
