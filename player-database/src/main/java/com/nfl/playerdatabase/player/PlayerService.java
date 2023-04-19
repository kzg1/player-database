package com.nfl.playerdatabase.player;

import java.io.IOException;
import java.io.Writer;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	private final PlayerRepository playerRepository;

	@Autowired
	public PlayerService(PlayerRepository playerRepository) {
		super();
		this.playerRepository = playerRepository;
	}

	public List<Player> getPlayers() {
		return playerRepository.findAll();
	}

	public void addPlayer(String name, int TD) {
		this.playerRepository.save(new Player(name, TD));
	}

	public List<Player> filter(List<Player> list, int minLimit,int maxLimit, String input, boolean sort) {
		Predicate<? super Player> predicate = x -> true;
		Comparator<? super Player> comparator = Comparator.comparing(Player::getId);
		if (input.equals("TD")) {
			predicate = x -> (x.getTD() > minLimit && x.getTD() < maxLimit) ;
			comparator = Comparator.comparing(Player::getTD).reversed();
		} else if (input.equals("INT")) {
			predicate = x -> (x.getINT() > minLimit && x.getINT()<maxLimit);
			comparator = Comparator.comparing(Player::getINT).reversed();
		} else if (input.equals("yards")) {
			predicate = x -> (x.getYards() > minLimit && x.getYards()<maxLimit);
			comparator = Comparator.comparing(Player::getYards).reversed();
		} else if (input.equals("RTG")) {
			predicate = x -> (x.getRTG() > minLimit && x.getRTG()<maxLimit);
			comparator = Comparator.comparing(Player::getRTG).reversed();
		} else if (input.equals("cmpPerc")) {
			predicate = x -> (x.getCmpPerc() > minLimit && x.getCmpPerc()<maxLimit);
			comparator = Comparator.comparing(Player::getCmpPerc).reversed();
		} else if (input.equals("CMP")) {
			predicate = x -> (x.getCMP() > minLimit && x.getCMP()<maxLimit);
			comparator = Comparator.comparing(Player::getCMP).reversed();
		}
		if (sort) {
			return this.playerRepository.findAll().stream().filter(predicate).sorted(comparator)
					.collect(Collectors.toList());
		}
		return this.playerRepository.findAll().stream().filter(predicate).collect(Collectors.toList());
	}

	public void removePlayer(Integer id) {
		this.playerRepository.deleteById(id);
	}

	public void updatePlayer(Integer id, String name, Integer tD, Integer iNT, float cmpPrc) {
		// TODO Auto-generated method stub
		this.playerRepository.getById(id).setName(name);
		this.playerRepository.getById(id).setTD(tD);
		this.playerRepository.getById(id).setINT(iNT);
		this.playerRepository.getById(id).setCmpPerc(cmpPrc);
	}

	public Player getById(Integer id) {
		return this.playerRepository.findById(id).get();
	}

	public void save(Player player) {
		this.playerRepository.save(player);
	}

	public void writePlayersToCsv(List<Player> players, Writer writer) {
		try {
			CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
			for (Player player : players) {
				printer.printRecord(player.getId(), player.getName(), player.getTeam(), player.getPos(), player.getGS(),
						player.getCMP(), player.getATT(), player.getCmpPerc(), player.getYards(), player.getYPP(),
						player.getYPP(), player.getLNG(), player.getTD(), player.getINT(), player.getSacks(),
						player.getSYL(), player.getQBR(), player.getRTG());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
