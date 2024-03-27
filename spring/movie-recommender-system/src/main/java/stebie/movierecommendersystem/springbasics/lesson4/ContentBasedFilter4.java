package stebie.movierecommendersystem.springbasics.lesson4;

import org.springframework.stereotype.Component;
import stebie.movierecommendersystem.springbasics.lesson2.Filter2;

@Component
public class ContentBasedFilter4 implements Filter2 {
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}