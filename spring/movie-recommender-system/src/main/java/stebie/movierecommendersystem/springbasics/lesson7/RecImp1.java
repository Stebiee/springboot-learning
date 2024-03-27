package stebie.movierecommendersystem.springbasics.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecImp1 {
    // filter is a dependency of RecommenderImplementation
    private Filter7 filter;

    @Autowired
    public RecImp1(@Qualifier("CBF") Filter7 filter) {
        this.filter = filter;
        System.out.println("Constructor was called");
    }

    // use a filter to find recommendations
    public String[] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter);
        System.out.println("Movie passed " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }

}