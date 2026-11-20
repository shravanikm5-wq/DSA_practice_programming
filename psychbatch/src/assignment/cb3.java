package assignment;


	import java.util.ArrayList;
	import java.util.Collections;

	class Player2 implements Comparable<Player2> {
	    String name;
	    int score;

	    Player2(String name, int score) {
	        this.name = name;
	        this.score = score;
	    }

	    @Override
	    public int compareTo(Player2 p) {
	        return Integer.compare(p.score, this.score);
	    }

	    @Override
	    public String toString() {
	        return name + " " + score;
	    }
	}

	public class cb3 {
	    public static void main(String[] args) {
	        ArrayList<Player2> l = new ArrayList<>();

	        l.add(new Player2("Rahul", 50));
	        l.add(new Player2("Virat", 90));
	        l.add(new Player2("Rohit", 75));
	        l.add(new Player2("Dhoni", 60));

	        Collections.sort(l);

	        for (Player2 p : l) {
	            System.out.println(p);
	        }
	    }
	}


