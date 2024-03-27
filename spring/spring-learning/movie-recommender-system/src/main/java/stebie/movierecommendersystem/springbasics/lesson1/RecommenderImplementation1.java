package stebie.movierecommendersystem.springbasics.lesson1;

public class RecommenderImplementation1 {
    public String[] recommendMovies(String movie) {
        //use content based filter to find similar movies
        ContentBasedFilter1 filter = new ContentBasedFilter1();
        String[] results = filter.getRecommendations(movie);
        //return the results
        return results;
    }
}