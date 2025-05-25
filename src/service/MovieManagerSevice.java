package service;

import model.Movie;
import model.Show;
import model.Theater;

import java.util.List;

public interface MovieManagerSevice {

    public void addMovie(String city, Show show);
    public void addMovieByCity(Show show, List<String> cities);
    public boolean deleteMovie(Show show,String city);
//    public boolean deleteMovieByCity(Show show, List<String> cities);
//    public boolean updateMovie(Show show,String city, Theater theater);
//    public boolean updateMovieByCity(Show show,List<String> cities);
}
