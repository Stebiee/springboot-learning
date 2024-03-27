package stebie.movierecommendersystem.springbasics.lesson6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication6 {

	public static void main(String[] args) {
		/**
		 * the beans that spring creates are managed by the ApplicationContext
		 * information about beans can be found in the ApplicationContext
		 *
		 * the run() method from SpringApplication
		 * returns ApplicationContext which can be assigned to a variable
		 *
		 * the getBean method of ApplicationContext
		 * can be used to get the bean of a certain class
		 */

		// use run() to store the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(
				MovieRecommenderSystemApplication6.class, args);

		// use app context getBean() of class RecommenderImplementation4
		RecommenderImplementation6 recommender = appContext.getBean(
				RecommenderImplementation6.class);

		// use method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		// display the results
		System.out.println(Arrays.toString(result));
	}
}