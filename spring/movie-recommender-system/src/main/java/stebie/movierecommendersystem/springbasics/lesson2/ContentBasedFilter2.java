package stebie.movierecommendersystem.springbasics.lesson2;

public class ContentBasedFilter2 implements Filter2 {
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}