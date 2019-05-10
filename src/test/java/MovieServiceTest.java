import movies.Movie;
import movies.MovieService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MovieServiceTest {

    private MovieService movieService;


    @Before
    public void setup() throws Exception {
        movieService = new MovieService();
    }

    @Test
    public void testSearch() throws Exception {

        String search = "Action";
        List<String> cast = new ArrayList<String>();
        List<String> genres = new ArrayList<String>();
        cast.add("Action");
        cast.add("drama");

        genres.add("g2");
        genres.add("g3");

        List<Movie> m = new ArrayList<Movie>();

        Movie m1 = new Movie();
        m1.setYear("1980");
        m1.setTitle("Action avengers");
        m1.setCast(cast);
        m1.setGenres(genres);

        m.add(m1);

        String expectedResponse = "Input: \"Action\" Output: Search Term: \"Action\" Movie:" +
                " \"Action avengers\" count: 2";

        String output = movieService.search(search, m);

         assertEquals(expectedResponse, output);


    }

    @Test
    public void testSearch2() throws Exception {

        String search = "drama";
        List<String> cast = new ArrayList<String>();
        List<String> genres = new ArrayList<String>();
        cast.add("Action");
        cast.add("drama");

        genres.add("g2");
        genres.add("g3");

        List<Movie> m = new ArrayList<Movie>();

        Movie m1 = new Movie();
        m1.setYear("1980");
        m1.setTitle("Action avengers");
        m1.setCast(cast);
        m1.setGenres(genres);

        m.add(m1);

        String expectedResponse = "Input: \"drama\" Output: Search Term: " +
                "\"drama\" Movie: \"Action avengers\" count: 1";

        String output = movieService.search(search, m);

        assertEquals(expectedResponse, output);


    }
}
