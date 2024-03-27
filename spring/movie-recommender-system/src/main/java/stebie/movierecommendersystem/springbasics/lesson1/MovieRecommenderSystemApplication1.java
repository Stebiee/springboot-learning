package stebie.movierecommendersystem.springbasics.lesson1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication1 {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//passing name of the filter as constructor argument
		RecommenderImplementation1 recommender = new RecommenderImplementation1();
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		//display results
		System.out.println(Arrays.toString(result));

	}
}