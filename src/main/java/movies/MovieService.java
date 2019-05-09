package movies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class iteratively searches and counts
 * if a word (or phrase) is present in the JSON object
 * @author  Sanchit Mehra
 * @version 1.0
 * @since   2019-05-09
 */
@Service
public class MovieService {

    /**
     * This variable prints the application logs
     */
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    /**
     * This method is used to search movies
     * and eventually count the number of occurrences
     * @param search This the first parameter to search word (phrase)
     * @param movies This is the second parameter to search word in list of movies
     * @return
     */
    public String search(String search, List<Movie> movies) {
        int count = 0;
        Output output = new Output(search);
        LOG.info("search function called...");
        for (Movie m : movies) {
            Boolean found = false;

            if(m.title.contains(search)) {
                count++;
                found = true;
            }

            if(m.year.contains(search)) {
                count++;
                found = true;
            }

            for(String cast : m.cast) {
                if(cast.contains(search)) {
                    count++;
                    found = true;
                }
            }

            for(String genres : m.genres) {
                if(genres.contains(search)) {
                    count++;
                    found = true;
                }
            }
            output.setCount(count);

            if(found) {
                output.addMovie(m.title);
            }

        }

        return output.toString();
    }

}
