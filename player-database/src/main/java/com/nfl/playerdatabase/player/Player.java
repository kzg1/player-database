package com.nfl.playerdatabase.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Player {

	@Id
	@SequenceGenerator(
			name = "player_sequence",
			sequenceName = "player_sequence",
			allocationSize =1
			)
	@GeneratedValue(
			strategy =GenerationType.SEQUENCE,
			generator = "player_sequence"
			)
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTD() {
		return TD;
	}
	public void setTD(int tD) {
		TD = tD;
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
	
	
	public Player(String name, String team, String pos, int GS, int cMP, int aTT, float cmpPerc, int yards,
            float yPP, float yPG,
            int lNG, int tD, int iNT, int sacks, int sYL, float qBR, float rTG) {
 //       this.id = id;
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
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public int getGS() {
		return GS;
	}
	public void setGS(int gS) {
		GS = gS;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getCMP() {
		return CMP;
	}
	public void setCMP(int cMP) {
		CMP = cMP;
	}
	public int getATT() {
		return ATT;
	}
	public void setATT(int aTT) {
		ATT = aTT;
	}
	public float getCmpPerc() {
		return cmpPerc;
	}
	public void setCmpPerc(float cmpPerc) {
		this.cmpPerc = cmpPerc;
	}
	public int getYards() {
		return yards;
	}
	public void setYards(int yards) {
		this.yards = yards;
	}
	public float getYPP() {
		return YPP;
	}
	public void setYPP(float yPP) {
		YPP = yPP;
	}
	public float getYPG() {
		return YPG;
	}
	public void setYPG(float yPG) {
		YPG = yPG;
	}
	public int getLNG() {
		return LNG;
	}
	public void setLNG(int lNG) {
		LNG = lNG;
	}
	public int getINT() {
		return INT;
	}
	public void setINT(int iNT) {
		INT = iNT;
	}
	public int getSacks() {
		return sacks;
	}
	public void setSacks(int sacks) {
		this.sacks = sacks;
	}
	public int getSYL() {
		return SYL;
	}
	public void setSYL(int sYL) {
		SYL = sYL;
	}
	public float getQBR() {
		return QBR;
	}
	public void setQBR(float qBR) {
		QBR = qBR;
	}
	public float getRTG() {
		return RTG;
	}
	public void setRTG(float rTG) {
		RTG = rTG;
	}


}
