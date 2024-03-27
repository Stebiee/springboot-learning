package stebie.movierecommendersystem.springindepth.lesson13;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class RecImp13 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Filter13 filter;

    @Inject
    @Qualifier("CF")
    public void setFilter(Filter13 filter) {
        this.filter = filter;
    }

    public Filter13 getFilter() {
        return this.filter;
    }
}
