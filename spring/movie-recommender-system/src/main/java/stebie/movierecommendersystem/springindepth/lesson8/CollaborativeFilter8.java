package stebie.movierecommendersystem.springindepth.lesson8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("CF") // short for collaborative filter
@Scope("prototype")
public class CollaborativeFilter8 implements Filter8 {
    public CollaborativeFilter8() {
        super();
        System.out.println("CollaborativeFilter8 constructor called");
    }

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}