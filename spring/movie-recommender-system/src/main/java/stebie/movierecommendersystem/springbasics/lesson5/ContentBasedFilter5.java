package stebie.movierecommendersystem.springbasics.lesson5;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter5 implements Filter5 {
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}