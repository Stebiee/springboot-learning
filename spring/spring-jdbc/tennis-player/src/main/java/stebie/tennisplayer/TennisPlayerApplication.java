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

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDao dao;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// view players
		//logger.info("\nAll Players Data: {}", dao.getAllPlayers());

		// view player by id
		//logger.info("\nPlayer with ID 3: {}", dao.getPlayerById(3));

		// insert a player at id
		logger.info("Insertion of Player at 4: {}", dao.insertPlayer(new Player(
							4, "Roger Federer", "Swiss",
							new Date(System.currentTimeMillis()), 103)));
		// view player by id
		logger.info("Players with Id 4: {}", dao.getPlayerById(4));

		// Updating a player
		logger.info("Updating Player 4: {}", dao.updatePlayer(new Player(
							4, "Roger Federer", "Swiss",
							Date.valueOf("2000-02-27"), 104)));

		// view player by id
		logger.info("Players with Id 4: {}", dao.getPlayerById(4));
	}
}