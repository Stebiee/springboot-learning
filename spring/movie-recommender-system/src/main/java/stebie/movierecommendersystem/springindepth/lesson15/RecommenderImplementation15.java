package stebie.movierecommendersystem.springindepth.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation15 {
    // filter is a dependency of RecommenderImplementation
    @Autowired
    @Qualifier("CBF")
    private Filter15 filter;

    @Value("${recommender.implementation.favMovie: Cars}")
    String favMovie; // dynamically loaded from app.properties, def. val. is Cars

    // use a filter to find recommendations
    public String[] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter);
        System.out.println("Movie passed " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }

    public String getFavMovie() {
        return favMovie;
    }

}