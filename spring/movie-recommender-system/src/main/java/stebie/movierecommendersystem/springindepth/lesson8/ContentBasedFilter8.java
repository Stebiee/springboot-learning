package stebie.movierecommendersystem.springindepth.lesson8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")// short for content based filter
public class ContentBasedFilter8 implements Filter8 {
    public ContentBasedFilter8() {
        super();
        System.out.println("ContentBasedFilter8 constructor called");
    }

    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}