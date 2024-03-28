package stebie.tennisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


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
			testTableCreation();
	}

	private void testDelete() {
		// deleting a player
		logger.info("\nBefore delete: {}", dao.getAllPlayers());
		logger.info("Deleting Player with ID 2: {}", dao.deletePlayerById(2));
		logger.info("\nAfter delete: {}", dao.getAllPlayers());
	}

	private void testTableCreation() {
		dao.createTournamentTable();
	}
}