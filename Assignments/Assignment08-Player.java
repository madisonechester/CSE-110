// CSE 110     : #11178
// Assignment  : Assignment 08
// Author      : Madison Chester - 1219358478
// Description : to instantiate Player objects that will store the important information (name, block, score) for a player

public class Player {
	
	private String fullName = "";
	private double blockScore = 0;
	private double attackScore = 0;
	
	public Player(String name, double blockingScore, double attackingScore) {
	    this.fullName = name;
	    this.blockScore = blockingScore;
	    this.attackScore = attackingScore;
}
	public String getName() {
	    return this.fullName;
	}
	
	public double getBlockScore() {
		return this.blockScore;
	}
	
	public void setBlockScore(double newBlockScore) {
	      this.blockScore = newBlockScore;
	}
	
	public double getAttackScore() {
		return this.attackScore;
	}
	
	public void setAttackScore(double newAttackScore) {
	      this.attackScore = newAttackScore;
	}
	
	public void displayPlayerInfo() {
		System.out.printf(fullName + "(block = %.2f, attack = %.2f)\n", blockScore, attackScore);
	}

}
