package stebie.movierecommendersystem.springindepth.lesson10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = "stebie.movierecommendersystem.springindepth.lesson9")
@ComponentScan(includeFilters = @ComponentScan.Filter (type= FilterType.REGEX,
 	    pattern = "stebie.movierecommendersystem.indepth.lesson10.*"))
public class MovieRecommenderSystemApplication10 {
	/*
	* With component scan base package must be set to 9 and then filter passed for 10*/

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication10.class, args);

		// check if bean from package 10 and 9 are found
		System.out.println("package 9 bean CBF found: " + appContext.containsBean("contentBasedFilter9"));
		System.out.println("package 10 bean CF found: " + appContext.containsBean("collaborativeFilter10"));
	}
}