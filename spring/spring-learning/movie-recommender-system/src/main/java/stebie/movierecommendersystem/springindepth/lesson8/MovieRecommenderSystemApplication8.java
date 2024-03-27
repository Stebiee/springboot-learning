package stebie.movierecommendersystem.springindepth.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication8 {

	public static void main(String[] args) {
		/**
		 * as can be seen from the output
		 * singleton beans are created before request
		 * prototype beans are created at request
		 */

		// use run() to store the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(
				MovieRecommenderSystemApplication8.class, args);

		// retrieve singleton bean from app context 3 times
		ContentBasedFilter8 cbf1 = appContext.getBean(ContentBasedFilter8.class);
		ContentBasedFilter8 cbf2 = appContext.getBean(ContentBasedFilter8.class);
		ContentBasedFilter8 cbf3 = appContext.getBean(ContentBasedFilter8.class);

		// as shown in the output the 3 objects are identical
		System.out.println("Singleton scope:");
		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);

		// retrieve prototype bean from app context 3 times
		CollaborativeFilter8 cf1 = appContext.getBean(CollaborativeFilter8.class);
		CollaborativeFilter8 cf2 = appContext.getBean(CollaborativeFilter8.class);
		CollaborativeFilter8 cf3 = appContext.getBean(CollaborativeFilter8.class);

		// as shown in the output the 3 objects are different
		System.out.println("Prototype scope:");
		System.out.println(cf1);
		System.out.println(cf2);
		System.out.println(cf3);
	}
}