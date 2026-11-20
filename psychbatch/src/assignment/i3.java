package assignment;

	import java.util.ArrayList;
	import java.util.Collections;

	class Player implements Comparable<Player> {
	    String name;
	    int score;

	    Player(String name, int score) {
	        this.name = name;
	        this.score = score;
	    }

	    @Override
	    public int compareTo(Player p) {
	        return Integer.compare(p.score, this.score);
	    }

	    @Override
	    public String toString() {
	        return name + " " + score;
	    }
	}

	public class i3 {
	    public static void main(String[] args) {
	        ArrayList<Player> l = new ArrayList<>();

	        l.add(new Player("Rahul", 50));
	        l.add(new Player("Virat", 90));
	        l.add(new Player("Rohit", 75));
	        l.add(new Player("Dhoni", 60));

	        Collections.sort(l);

	        for (Player p : l) {
	            System.out.println(p);
	        }
	    }
	

}
