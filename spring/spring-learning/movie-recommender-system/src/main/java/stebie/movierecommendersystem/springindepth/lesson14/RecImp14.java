package stebie.movierecommendersystem.springindepth.lesson14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class RecImp14 {

    private Filter14 filter;

    // constructor for using <constructor-arg> in xml
    // dependency injection handled in xml
    public RecImp14(Filter14 filter) {
        this.filter = filter;
    }


    // setter for using <property> in xml
    /*public void setFilter(Filter14 filter) {
        this.filter = filter;
    }*/

    // when setting up with xml setter and getters are needed for the dependency
    public Filter14 getFilter() {
        return this.filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Filter used: " + filter);
        return filter.getRecommendations(movie);
    }
}
