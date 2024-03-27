package stebie.movierecommendersystem.springindepth.lesson13;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;


@Named
@Qualifier("CBF")
public class ContentBasedFilter13 implements Filter13 {
    Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
    // keeping track of instances
    private static int instances = 0;


    public ContentBasedFilter13() {
        instances++;
    }

    public static int getInstances() {
        return ContentBasedFilter13.instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}