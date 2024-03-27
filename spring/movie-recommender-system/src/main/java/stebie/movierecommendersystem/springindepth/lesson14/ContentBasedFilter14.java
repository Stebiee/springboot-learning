package stebie.movierecommendersystem.springindepth.lesson14;


import org.springframework.stereotype.Component;

@Component("CBF14")
public class ContentBasedFilter14 implements Filter14 {
    // keeping track of instances
    private static int instances = 0;


    public ContentBasedFilter14() {
        instances++;
    }

    public static int getInstances() {
        return ContentBasedFilter14.instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}