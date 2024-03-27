package stebie.movierecommendersystem.springindepth.lesson12;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class RecImp12 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Filter12 filter;

    @Inject
    @Qualifier("CF")
    public void setFilter(Filter12 filter) {
        this.filter = filter;
    }

    public Filter12 getFilter() {
        return this.filter;
    }
}
