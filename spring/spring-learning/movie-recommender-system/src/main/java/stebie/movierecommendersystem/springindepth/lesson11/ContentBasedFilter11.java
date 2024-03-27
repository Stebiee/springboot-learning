package stebie.movierecommendersystem.springindepth.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter11 implements Filter11 {
    Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
    // keeping track of instances
    private static int instances = 0;


    public ContentBasedFilter11() {
        instances++;
        System.out.println("ContentBasedFilter8 constructor called");
    }

    public static int getInstances() {
        return ContentBasedFilter11.instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("in CBF post construct method load movies etc.");
    }

    @PreDestroy
    private void preDestroy() {
        logger.info("in CBF pre destroy method");
    }
}