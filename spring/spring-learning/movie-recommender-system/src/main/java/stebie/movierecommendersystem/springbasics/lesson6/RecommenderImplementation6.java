package stebie.movierecommendersystem.springbasics.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation6 {
    // filter is a dependency of RecommenderImplementation
    @Autowired
    @Qualifier("CBF")
    private Filter6 filter;

    // use a filter to find recommendations
    public String[] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter);
        System.out.println("Movie passed " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }

}