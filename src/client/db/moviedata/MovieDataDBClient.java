package client.db.moviedata;

import client.db.enums.City;
import client.db.enums.Genre;
import client.db.enums.Language;
import model.Movie;
import model.Show;
import model.Theater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieDataDBClient {
    Map<City, List<Movie>> movieByCity = new HashMap<>();
    Map<Genre, List<Movie>> movieByGenre = new HashMap<>();
    Map<Language, List<Movie>> movieByLanguage = new HashMap<>();

    public MovieDataDBClient(){

    }
    public void loadMovieData(){
        Long id =0l;
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Hulchal",id++,Language.HINDI,Genre.COMEDY));
        movies.add(new Movie("Bhagam Bhag",id++,Language.HINDI,Genre.COMEDY));
        movies.add(new Movie("Krish",id++,Language.HINDI,Genre.ACTION));
        movies.add(new Movie("Iron Man",id++,Language.ENGLISH,Genre.ACTION));
        movies.add(new Movie("Avengers",id++,Language.ENGLISH,Genre.SC_FI));
        movieByCity.put(City.DELHI,movies);
        movieByCity.put(City.MUMBAI,movies);
        movieByCity.put(City.BANGALORE,movies);
        for(Movie movie : movies){
            List<Movie> list = movieByGenre.getOrDefault(movie.genre(),new ArrayList<>());
            list.add(movie);
            movieByGenre.put(movie.genre(),list);

            list = movieByLanguage.getOrDefault(movie.language(),new ArrayList<>());
            list.add(movie);
            movieByLanguage.put(movie.language(),list);
        }
    }

    public List<Movie> getMovieByCity(City city){
        return movieByCity.get(city);
    }
    public List<Movie> getMovieByLanguage(Language lang){
        return movieByLanguage.get(lang);
    }
    public List<Movie> getMovieByGenre(Genre genre){
        return movieByGenre.get(genre);
    }
//    public void addMovieShow(String city, Show show){
//        Movie movie = show.movie();
//        movieByCity.put(city,movieByCity.getOrDefault(city,new ArrayList<>())).add(movie);
//        movieByGenre.put(movie.genre(),movieByGenre.getOrDefault(movie.genre(),new ArrayList<>())).add(movie);
//        movieByLanguage.put(movie.language(),movieByLanguage.getOrDefault(movie.genre(),new ArrayList<>())).add(movie);
//    }
//
//    public void addMovieShowByCity(List<String> cities, Show show) {
//        Movie movie = show.movie();
//        for (String city : cities) {
//            movieByCity.put(city, movieByCity.getOrDefault(city, new ArrayList<>())).add(movie);
//            movieByGenre.put(movie.genre(), movieByGenre.getOrDefault(movie.genre(), new ArrayList<>())).add(movie);
//            movieByLanguage.put(movie.language(), movieByLanguage.getOrDefault(movie.genre(), new ArrayList<>())).add(movie);
//        }
//    }
//    public void deleteMovieShow(Show show,String city){
//        Movie movie = show.movie();
//        movieByCity.put(city,movieByCity.getOrDefault(city,new ArrayList<>())).add(movie);
//        movieByGenre.put(movie.genre(),movieByGenre.getOrDefault(movie.genre(),new ArrayList<>())).add(movie);
//        movieByLanguage.put(movie.language(),movieByLanguage.getOrDefault(movie.genre(),new ArrayList<>())).add(movie);
//    }
}
