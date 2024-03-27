package stebie.movierecommendersystem.springbasics.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")// short for content based filter
public class ContentBasedFilter6 implements Filter6 {
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}