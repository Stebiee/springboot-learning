package stebie.tennisplayerrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository repo;

    //Get all players
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    //Get player by ID
    public Player getPlayerById(int id) {
        Optional<Player> tempPlayer = repo.findById(id);
        Player p = null;

        if (tempPlayer.isPresent()) {
            p = tempPlayer.get();
        } else {
            throw new RuntimeException("Player id " + id + " not found");
        }

        return p;
    }

    //Add a player
    public Player addPlayer(Player p) {
        return repo.save(p);
    }

    //Update a player

    //Partial update

    //delete a player
}
