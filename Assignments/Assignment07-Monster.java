// CSE 110     : #11178
// Assignment  : Assignment 07
// Author      : Madison Chester - 1219358478
// Description : program that simulates a battle between two Monsters

class Monster {

	private String name = "";
	private int health = 0;
	private Weapon weapon;
	
	public Monster(String monsterName, int healthLevel, Weapon newWeapon) {
		    this.name = monsterName;
		    this.health = healthLevel;
		    this.weapon = newWeapon;
	}
	
	public String getName() {
	    return this.name;
	      }
	
	 public int getHealth() {
		    return this.health;
		  }
	 
	 public String getWeaponName() {
		 return weapon.getName();
	 }
	 
	 public int attack(Monster monster) {
		 double amountDamage = Math.random() * weapon.getDamageMax();
		 int damage = (int) amountDamage;
		 monster.health = monster.health - damage;
		 return damage;
	 }
}