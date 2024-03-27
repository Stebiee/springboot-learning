package stebie.movierecommendersystem.springindepth.lesson12;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;


@Named
@Qualifier("CF")
public class CollaborativeFilter12 implements Filter12 {
    public CollaborativeFilter12() {
        super();
    }

    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}