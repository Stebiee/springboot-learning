package stebie.movierecommendersystem.springindepth.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// is a singleton with prototype bean dependency
@Component
public class ContentBasedFilter9 implements Filter9 {
    // keeping track of instances
    private static int instances = 0;

    @Autowired
    private Movie movie; // dependency which is a prototype

    public ContentBasedFilter9() {
        instances++;
        System.out.println("ContentBasedFilter8 constructor called");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return ContentBasedFilter9.instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}