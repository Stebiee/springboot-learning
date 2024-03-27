package stebie.movierecommendersystem.springindepth.lesson11;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecImp11 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Filter11 filter;

    @Autowired
    public void setFilter(Filter11 filter) {
        logger.info("In recImp11 setter method..dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct() {
        // init code goes below
        logger.info("In rec impl post construct method");
    }

    @PreDestroy
    public void preDestroy() {
        // cleanup code goes below
        logger.info("In rec impl pre destroy method");
    }
}
