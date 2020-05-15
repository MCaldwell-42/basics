package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.fullName = "Tim McGraw";
//	    player.health = 20;
//	    player.weapon = "sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = "+ player.healthRemaining());
//		Encapsulation is making sure that you can't do all of this like this to avoid problems.
		// keeping everything encapsulated inside the object class

		EnhancedPlayer player = new EnhancedPlayer("Tim", 120, "sword");
		System.out.println("Initial health is "+player.getHealth());


    }
}
