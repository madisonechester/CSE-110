// CSE 110     : #11178
// Assignment  : Assignment 08
// Author      : Madison Chester - 1219358478
// Description : to create and manage a roster of players

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Roster {
		
		private ArrayList<Player>players;
		
		public Roster() {
			players = new ArrayList<>();
		}
		
		public Roster(String fileName) throws FileNotFoundException {
			players = new ArrayList<>();
			String name;
			double attack;
			double block;
			File newFile = new File(fileName);
			Scanner scanner = new Scanner(newFile);
			while(scanner.hasNext()) {
				name = scanner.next();
				name += " " + scanner.next();
				attack = scanner.nextDouble();
				block = scanner.nextDouble();
				players.add(new Player(name, attack, block));
				}
			scanner.close();
			}
		
		public void addPlayer(String name,double attack,double block) {
			players.add(new Player(name, attack, block));
		}
		
		public int getPlayerCount() {
			return players.size();
		}
		
		public Player getPlayer(String name) {
			for(Player P:players) {
			if(P.getName().equals(name))
				return P;
			}
			return null;
			}
		
		public void displayTopAttackers(){
			Player secondLargest = players.get(getPlayerCount()-1);
			Player largest = players.get(getPlayerCount());
			System.out.println(secondLargest);
			System.out.println(largest);

		}
		
		public void displayTopBlockers(){
			Player secondLargest = players.get(getPlayerCount()-1);
			Player largest = players.get(getPlayerCount());
			System.out.println(secondLargest);
			System.out.println(largest);
		}
		
		public void displayAllPlayers() {
			
		}
		
	}


