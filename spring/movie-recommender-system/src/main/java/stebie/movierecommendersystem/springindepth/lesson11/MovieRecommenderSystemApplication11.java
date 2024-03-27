package stebie.movierecommendersystem.springindepth.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication11 {
	/*
	* With component scan base package must be set to 9 and then filter passed for 10*/

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication11.class, args);

		RecImp11 recImp = appContext.getBean(RecImp11.class);
	}
}