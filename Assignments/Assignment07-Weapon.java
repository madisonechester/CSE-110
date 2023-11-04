// CSE 110     : #11178
// Assignment  : Assignment 07
// Author      : Madison Chester - 1219358478
// Description : program that simulates a battle between two Monsters

class Weapon {

	private String name;
	private int damageMax;
	
	public Weapon() {
	    this.name = "Sharp Stick";
	    this.damageMax = 2;
	  }
	
	public Weapon(String weaponName, int damage) {
	    this.name = weaponName;
	    this.damageMax = damage;
	  }
	
	public String getName() {
	    return this.name;
	  }

	  public void setName(String newName) {
	      this.name = newName;
	  }

	  public int getDamageMax() {
	    return this.damageMax;
	  }

	  public void setDamageMax(int newDamageMax) {
	      this.damageMax = newDamageMax;
	  }
}
