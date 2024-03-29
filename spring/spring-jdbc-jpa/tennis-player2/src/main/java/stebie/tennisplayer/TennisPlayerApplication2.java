package stebie.tennisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.util.Optional;


@SpringBootApplication
public class TennisPlayerApplication2 implements CommandLineRunner {
	@Autowired
	PlayerSpringDataRepository repo;
	private Logger logger = LoggerFactory.getLogger(this.getClass());


	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Inserting rows
		logger.info("\n\n>>Inserting Player: {}", repo.save(new Player("Djokovic", "Serbia",
				Date.valueOf("1987-05-22"), 81)));
		logger.info("\n\n>>Inserting Player: {}", repo.save(new Player("Monfils", "France",
				Date.valueOf("1986-09-01"), 10)));
		logger.info("\n\n>>Inserting Player: {}", repo.save(new Player("Thiem", "Austria",
				new Date(System.currentTimeMillis()), 17)));

		// updating a player
		Player player = repo.findById(2).get(); // throws error if element not found
		player.setTitles(player.getTitles() + 1);
		logger.info("\n\n>> Updated id 2 titles; {}", repo.save(player));

		// using nationality to find player
		logger.info("\n\n>> Players from France: {}", repo.findByNationality("France"));

		// using titles to find player
		logger.info("\n\n>> Players with 17 titles: {}", repo.findByTitles(17));
	}
}