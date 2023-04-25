package com.nfl.playerdatabase.player;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class PlayerController {

	private PlayerService playerService;

	
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}

	@GetMapping("/")
	public String players() {
		return "home";
	}

	//Listing players
	@GetMapping("/players")
	public String playerList(ModelMap model) {
		//Sorting to prevent reordering when you update a player
		List<Player> playerList = playerService.getPlayers().stream().sorted(Comparator.comparing(Player::getId)).collect(Collectors.toList());
		model.addAttribute("playerList", playerList);
		return "main";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	//Adding a new player
	@GetMapping("/addPlayer")
	public String addPlayer(ModelMap model) {
		Player player = new Player();
		model.put("player", player);
		return "update";
	}

	@PostMapping("/addPlayer")
	public String playerAdded(Player player) {
		this.playerService.save(player);
		return "redirect:players";
	}

	//Listing detailed player stats
	@GetMapping("/detailed")
	public String detailed(ModelMap model) {
		model.addAttribute("playerList", playerService.getPlayers());
		return "detailed";
	}

	//Filtering tool
	@GetMapping("/filter")
	public String filterTool() {
		return "filterTool";
	}

	@PostMapping("/filter")
	public String filterResult(ModelMap model, int minLimit, int maxLimit, String stats, boolean sort) {
		model.addAttribute("playerList", playerService.filter(playerService.getPlayers(), minLimit,maxLimit, stats, sort));
		System.out.println(sort);
		return "filterResult";
	}

	//Player removing
	@GetMapping("/removePlayer")
	public String removePlayer(@RequestParam Integer id) {
		this.playerService.removePlayer(id);
		return "redirect:players";
	}

	@GetMapping("/updatePlayer")
	public String updatePlayer(@RequestParam Integer id, ModelMap model) {
		model.put("player", playerService.getById(id));
		return "update";
	}
	
	//Player updating
	@PostMapping("/updatePlayer")
	public String updatedPlayer(Player player) {
			this.playerService.save(player);
			this.playerService.getPlayers().stream().sorted(Comparator.comparing(Player::getId));
		return "redirect:players";
	}
	//CSV export
	@GetMapping("/exportCSV")
	public void exportCsv(HttpServletResponse response) throws IOException {
		response.setContentType("text/csv");
		 response.addHeader("Content-Disposition", "attachment; filename=\"player.csv\"");
		 this.playerService.writePlayersToCsv(this.playerService.getPlayers(), response.getWriter());
	}

}
