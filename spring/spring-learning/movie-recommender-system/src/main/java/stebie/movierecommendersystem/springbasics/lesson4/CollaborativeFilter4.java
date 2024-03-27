package stebie.movierecommendersystem.springbasics.lesson4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import stebie.movierecommendersystem.springbasics.lesson2.Filter2;

@Component
@Primary
public class CollaborativeFilter4 implements Filter2 {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}