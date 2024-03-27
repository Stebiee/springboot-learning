package stebie.movierecommendersystem.springbasics.lesson3;

import stebie.movierecommendersystem.springbasics.lesson2.Filter2;


public class ContentBasedFilter3 implements Filter2 {
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}