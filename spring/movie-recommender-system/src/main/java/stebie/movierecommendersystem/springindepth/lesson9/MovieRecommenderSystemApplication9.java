package stebie.movierecommendersystem.springindepth.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication9 {

	public static void main(String[] args) {
		/**
		 * since CBF is a singleton scope only one instance of the bean is created
		 * although the dependency Movie is a prototype scope
		 * it is injected on context creation and is then considered a singleton
		 *
		 * this can be bypassed by using proxy on the prototype bean
		 * which in this case creates a new instance of movie every method call
		 */

		// use run() to store the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(
				MovieRecommenderSystemApplication9.class, args);

		// retrieve singleton bean from application context
		ContentBasedFilter9 filter = appContext.getBean(ContentBasedFilter9.class);
		System.out.println("CBF bean with singleton scope");
		System.out.println(filter);

		// retrieve prototype bean from application context
		Movie m1 = filter.getMovie();
		Movie m2 = filter.getMovie();
		Movie m3 = filter.getMovie();

		System.out.println("Movie bean with prototype scope");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		// print number of instances of each bean
		System.out.println("CBF instances created: " + ContentBasedFilter9.getInstances());
		System.out.println("Movie instances created: " + Movie.getInstances());
	}
}