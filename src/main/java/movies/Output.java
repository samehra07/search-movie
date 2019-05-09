package movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a word (or phrase) search a given JSON object.</h1>
 * The Output program implements an application that
 * performs search to return the title of a movie
 * when a word or phrase is passed.
 * @author  Sanchit Mehra
 * @version 1.0
 * @since   2019-05-09
 */

public class Output {
    String searchTerm;
    List<String> movie;
    Integer count;
    /**
     * This is a constructor which takes an argument
     * of type string "searchTerm" to initialize
     * the fields of the object.
     */

    public Output(String searchTerm) {
        setSearchTerm(searchTerm);
    }

    /**
     * This is a constructor which takes three argument
     * of type string "searchTerm", type List "movie"
     * and type Integer "count" to
     * initialize the fields of the object.
     */
    public Output(String searchTerm, List<String> movie, Integer count) {
        this.searchTerm = searchTerm;
        this.movie = movie;
        count = count;
    }

    /**
     * This is a getter function
     * to return the list of movies
     * in the desired format.
     * @return string This returns the list of movies in string format.
     */
    public String getMovies() {
        String res = new String();
        int moviesCount = this.movie.size();
        for(String m : this.movie) {
            moviesCount--;
            if(moviesCount != 0) {
                res += "\"" + m.toString() + "\", ";
            } else {
                res += "\"" + m.toString() + "\"";
            }
        }
        return res;
    }

    /**
     * This is a setter function
     * to set the value of the movie field
     * @param movie This is the paramter to set the movie field of the movie object
     */

    public void setMovie(List<String> movie) {
        this.movie = movie;
    }

    /**
     * This method is used to add movie field to the movie object
     * @param movie This is the first paramter to addMovie method
    */
    public void addMovie(String movie) {
        if(this.movie == null) {
            this.movie = new ArrayList<String>();
        }
        this.movie.add(movie);
    }

    /**
     * This is a getter function
     * to return search term (to be searched in the list of movies)
     * @return searchTerm This returns the search term.
     */

    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * This is a setter function
     * to set the value of the search term
     * @param searchTerm This is the paramter to set the value of search term
     */


    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * This is a getter function
     * to return the count
     * @return count This returns the title wherever the search term is present.
     */

    public Integer getCount() {
        return count;
    }

    /**
     * This is a setter function
     * to set the value of the search term count
     * @param count This is the paramter to set the value of search term's count
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This function return the output
     * in the desired format
     */
    public String toString() {
        return  "Input: \"" + this.searchTerm +
                "\" Output: Search Term: \"" + this.searchTerm +
                "\" Movie: " + this.getMovies() +
                " count: " + this.count;
    }
}
