package stebie.movierecommendersystem.springindepth.lesson13;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;


@Named
@Qualifier("CF")
public class CollaborativeFilter13 implements Filter13 {
    public CollaborativeFilter13() {
        super();
    }

    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}