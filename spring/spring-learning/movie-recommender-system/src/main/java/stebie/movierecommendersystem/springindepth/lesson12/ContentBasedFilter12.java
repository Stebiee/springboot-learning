package stebie.movierecommendersystem.springindepth.lesson12;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.inject.Named;

@Named
@Qualifier("CBF")
public class ContentBasedFilter12 implements Filter12 {
    Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
    // keeping track of instances
    private static int instances = 0;


    public ContentBasedFilter12() {
        instances++;
    }

    public static int getInstances() {
        return ContentBasedFilter12.instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}