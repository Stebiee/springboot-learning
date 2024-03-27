package stebie.movierecommendersystem.springbasics.lesson2;

public class CollaborativeFilter2 implements Filter2 {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}