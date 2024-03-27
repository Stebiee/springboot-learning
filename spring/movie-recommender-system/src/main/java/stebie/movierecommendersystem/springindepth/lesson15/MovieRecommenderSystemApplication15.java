package stebie.movierecommendersystem.springindepth.lesson15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication15 {

	public static void main(String[] args) {
		/**
		 *
		 */

		// use run() to store the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(
				MovieRecommenderSystemApplication15.class, args);

		// use app context getBean() of class RecommenderImplementation4
		RecommenderImplementation15 recommender = appContext.getBean(
				RecommenderImplementation15.class);

		// use method to get recommendations
		String favMovie = recommender.getFavMovie();

		// display the results
		System.out.println(favMovie);
	}
}