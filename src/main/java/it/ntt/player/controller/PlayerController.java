package it.ntt.player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.ntt.player.repo.PlayerRepo;

@Controller
public class PlayerController {
    
    private PlayerRepo playerRepo;

    public PlayerController(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    @GetMapping("/")
    public String getPlayers(Model model) {
        model.addAttribute("players", playerRepo.findAll());
        return "Players";
    }

}
