package stebie.movierecommendersystem.springbasics.lesson5;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter5 implements Filter5 {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}