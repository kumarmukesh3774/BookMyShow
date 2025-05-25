package service;

import client.db.enums.City;
import client.db.enums.Genre;
import client.db.enums.Language;
import model.Movie;
import model.Order;
import model.User;

import java.util.List;

public interface MovieCatalogueSevice {

    public List<Movie> getMoviesByCity(City city);
    public List<Movie> getMoviesByLanguage(Language lang);
    public List<Movie> getMoviesByGenre(Genre genre);
    public List<Order> getOrderHistory(User user);


}
