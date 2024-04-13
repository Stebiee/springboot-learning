package stebie.tennisplayerrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    PlayerService service;

    @GetMapping("/test-api")
    public String welcome() {
        return "REST API is working";
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return service.getAllPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player p) {
        p.setId(0);

        return service.addPlayer(p);
    }

    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable("id") int playerId) {
        return service.getPlayerById(playerId);
    }
}
