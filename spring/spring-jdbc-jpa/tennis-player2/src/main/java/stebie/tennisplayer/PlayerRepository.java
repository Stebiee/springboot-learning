package stebie.tennisplayer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PlayerRepository {
    @PersistenceContext
    EntityManager entityManager;

    public Player insertPlayer(Player player) {
        return entityManager.merge(player);
    }

    public Player updatePlayer(Player player) {

        return entityManager.merge(player);
    }

    public Player findPlayerById(int id) {
        return entityManager.find(Player.class, id);
    }

    public void deletePlayerById(int id) {
        Player player = findPlayerById(id);
        entityManager.remove(player);
    }
}
