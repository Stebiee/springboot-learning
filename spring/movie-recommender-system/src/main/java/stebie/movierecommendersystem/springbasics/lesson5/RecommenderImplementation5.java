package stebie.movierecommendersystem.springbasics.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation5 {
    // filter is a dependency of RecommenderImplementation
    @Autowired
    private Filter5 contentBasedFilter5;

    // use a filter to find recommendations
    public String[] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + contentBasedFilter5);
        System.out.println("Movie passed " + movie + "\n");
        String[] results = contentBasedFilter5.getRecommendations(movie);
        return results;
    }

}