package stebie.movierecommendersystem.springbasics.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import stebie.movierecommendersystem.springbasics.lesson2.Filter2;

@Component
public class RecommenderImplementation4 {
    // filter is a dependency of RecommenderImplementation3x
    @Autowired
    private Filter2 filter;

    public RecommenderImplementation4(Filter2 filter) {
        super();
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String[] recommendMovies (String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter);
        System.out.println("Movie passed " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}