package movies;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * This is a class which takes http request
 * to search a given word (phrase) in the list of movies
 * @author  Sanchit Mehra
 * @version 1.0
 * @since   2019-05-09
 */

@RestController
@RequestMapping("/searchMovies")

public class MovieController {

    MovieService movieService;

    /**
     * This is a constructor to initialize the MovieService layer object
     */

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * This is a controller method which takes
     * the http request to search a word (phrase)
     * @param search Word to search in a list of movies
     * @param movies List of movies
     * @return it returns the occurrence(s) of the word (phrase) in the list of movies
     */

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String searchMovies(@RequestParam(value = "search", required = true) String search,
                                        @RequestParam(value = "movies", required = true)String movies, HttpServletRequest request) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        List<Movie> movie = mapper.readValue(movies, new TypeReference<List<Movie>>(){});
        return movieService.search(search, movie);
    }

}
