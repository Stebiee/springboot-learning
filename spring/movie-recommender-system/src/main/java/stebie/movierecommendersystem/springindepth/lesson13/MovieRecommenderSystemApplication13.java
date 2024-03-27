package stebie.movierecommendersystem.springindepth.lesson13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan// autofills with package of this class
public class MovieRecommenderSystemApplication13 {
	/*
	* using spring core
	*/

	public static void main(String[] args) {
		//ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication13.class, args);
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication13.class);

		RecImp13 rec = appContext.getBean(RecImp13.class);

		String[] result = rec.getFilter().getRecommendations("Finding Dory");

		System.out.println("Recommended movies are: " + Arrays.toString(result));

		appContext.close();
	}
}