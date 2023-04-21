package com.nfl.playerdatabase.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter @Setter 
public class Player {

	@Id
	@SequenceGenerator(name = "player_sequence", sequenceName = "player_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
	private Integer id;
	private String name;
	private String pos;
	private int GS;
	private String team;
	private int CMP;
	private int ATT;
	private float cmpPerc;
	private int yards;
	private float YPP;
	private float YPG;
	private int LNG;
	private int TD;
	private int INT;
	private int sacks;
	private int SYL;
	private float QBR;
	private float RTG;

	public Player() {
		super();
	}



	public Player(Integer id, String name, int tD) {
		super();
		this.id = id;
		this.name = name;
		TD = tD;
	}

	public Player(String name, int tD) {
		super();
		this.name = name;
		TD = tD;
	}

	public Player(String name, String team, String pos, int GS, int cMP, int aTT, float cmpPerc, int yards, float yPP,
			float yPG, int lNG, int tD, int iNT, int sacks, int sYL, float qBR, float rTG) {
		// this.id = id;
		this.name = name;
		this.team = team;
		this.pos = pos;
		this.GS = GS;
		this.CMP = cMP;
		this.ATT = aTT;
		this.cmpPerc = cmpPerc;
		this.yards = yards;
		this.YPP = yPP;
		this.YPG = yPG;
		this.LNG = lNG;
		this.TD = tD;
		this.INT = iNT;
		this.sacks = sacks;
		this.SYL = sYL;
		this.QBR = qBR;
		this.RTG = rTG;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", TD=" + TD + "]";
	}


}
