package stebie.tennisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;


@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {
	@Autowired
	PlayerRepository repo;
	private Logger logger = LoggerFactory.getLogger(this.getClass());


	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// inserting players
		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
				new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));

		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
				new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));

		// finding player by id
		logger.info("\n\n>> Player with id 2: {}\n", repo.findPlayerById(2));

		// updating player
		Player player = repo.findPlayerById(2);
		player.setBirthDate(Date.valueOf("1990-09-01"));
		logger.info("\n\n>> Updating id 2 DOB: {}\n", repo.updatePlayer(player));
		logger.info("\n\n>> Player with id 2: {}\n", repo.findPlayerById(2));

		// deleting player
		logger.info("\n\n>> Deleting Player with id 1\n");
		repo.deletePlayerById(1);
	}
}