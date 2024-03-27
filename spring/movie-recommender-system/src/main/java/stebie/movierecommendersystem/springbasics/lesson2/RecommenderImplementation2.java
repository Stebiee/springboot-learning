package stebie.movierecommendersystem.springbasics.lesson2;

public class RecommenderImplementation2 {
    //use filter interface to select filter
    private Filter2 filter;

    public RecommenderImplementation2(Filter2 filter) {
        super();
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String[] recommendMovies (String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter);
        System.out.println("Movie passed " + movie + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}