package stebie.movierecommendersystem.springindepth.lesson12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication12 {
	/*
	*
	*/

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication12.class, args);

		RecImp12 rec = appContext.getBean(RecImp12.class);

		// making sure that bean is found and its filter dependency is set
		System.out.println(rec);
		System.out.println(rec.getFilter());
	}
}