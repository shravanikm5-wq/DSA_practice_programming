package assignment;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class Player {
	    String name;
	    int score;

	    Player(String name, int score) {
	        this.name = name;
	        this.score = score;
	    }
	}

	class SortByScore implements Comparator<Player> {
	    public int compare(Player p1, Player p2) {
	        return Integer.compare(p1.score, p2.score);
	    }
	}

	public class ct4 {
	    public static void main(String[] args) {
	        ArrayList<Player> l = new ArrayList<>();

	        l.add(new Player("Virat", 90));
	        l.add(new Player("Rohit", 75));
	        l.add(new Player("Dhoni", 60));
	        l.add(new Player("Rahul", 50));

	        Collections.sort(l, new SortByScore());

	        for (Player p : l) {
	            System.out.println(p.score + " " + p.name);
	        }
	    }
	

}
