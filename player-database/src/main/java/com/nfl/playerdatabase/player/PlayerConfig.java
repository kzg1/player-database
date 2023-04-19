package com.nfl.playerdatabase.player;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {

	@Bean
	CommandLineRunner commandLineRunner(PlayerRepository repository) {

		return args -> {

		//	Player zoli = new Player(1, "zoli", 12);
		//	Player babett = new Player(2, "babett", 22);

		//	repository.saveAll(List.of(zoli, babett));
			
			// adding player function
			Function<String[], Player> toPlayer = new Function<String[], Player>() {

		        @Override
		        public Player apply(String[] t) {
		            // TODO Auto-generated method stub

		            return new Player(
		     //               Integer.valueOf(t[0]),
		                    t[1],
		                    t[2],
		                    t[3],
		                    Integer.valueOf(t[4]),
		                    Integer.valueOf(t[5]),
		                    Integer.valueOf(t[6]),
		                    Float.valueOf(t[7]),
		                    Integer.valueOf(t[8]),
		                    Float.valueOf(t[9]),
		                    Float.valueOf(t[10]),
		                    Integer.valueOf(t[11]),
		                    Integer.valueOf(t[12]),
		                    Integer.valueOf(t[13]),
		                    Integer.valueOf(t[14]),
		                    Integer.valueOf(t[15]),
		                    Float.valueOf(t[16]),
		                    Float.valueOf(t[17]));
		        }
		    };
			
		    repository.saveAll(Files.lines(Paths.get("nfl_stats2.csv"))
                .map(lines -> lines.split(","))
                .map(toPlayer)
                .sorted(Comparator.comparing(Player::getName))
                .collect(Collectors.toList()));
	

		};

	}
	
}
