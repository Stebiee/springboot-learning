package stebie.movierecommendersystem.springbasics.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecImp2 {
    // filter is a dependency of RecommenderImplementation
    private Filter7 filter;
    @Autowired
    @Qualifier("CF")
    public void setFilter(Filter7 filter) {
        System.out.println("Setter method was called");
        this.filter = filter;

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