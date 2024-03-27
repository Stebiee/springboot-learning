package stebie.movierecommendersystem.springindepth.lesson14;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class MovieRecommenderSystemApplication14 {
	/*
	* in the xml CF14 is made a bean and recImp14 and CBF14 are made beans with annotations
	*/

	public static void main(String[] args) {
		//ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication13.class, args);

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		RecImp14 rec = appContext.getBean("recImp14", RecImp14.class);

		// context should be loaded
		// check which beans are loaded
		System.out.println("Beans loaded: ");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

		// display filter list
		String[] res = rec.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(res));

		appContext.close();
	}
}