package stebie.movierecommendersystem.springindepth.lesson14;

import org.springframework.stereotype.Component;

@Component("CF14")
public class CollaborativeFilter14 implements Filter14 {
    public CollaborativeFilter14() {
        super();
    }

    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}