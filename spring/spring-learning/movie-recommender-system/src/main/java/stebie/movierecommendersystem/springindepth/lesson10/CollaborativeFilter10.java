package stebie.movierecommendersystem.springindepth.lesson10;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter10 implements Filter10 {
    public CollaborativeFilter10() {
        super();
        System.out.println("CollaborativeFilter8 constructor called");
    }

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}