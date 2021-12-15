package it.ntt.player.repo;

import org.springframework.data.repository.CrudRepository;

import it.ntt.player.model.Player;

public interface PlayerRepo extends CrudRepository<Player, Long> {
    
}
