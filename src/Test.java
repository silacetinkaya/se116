import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Player> players=new ArrayList<>();
        ArrayList<Character> player1Characters = new ArrayList<>();
        player1Characters.add(new Mage("Mage1", 80, "Female"));
        player1Characters.add(new Warrior("Warrior1", 100, "Male"));
        Player player1 = new Player("Player1", "password1", player1Characters);
        players.add(player1);

        ArrayList<Character> player2Characters = new ArrayList<>();
        player2Characters.add(new Mage("Mage2", 90, "Male"));
        player2Characters.add(new Warrior("Warrior2", 110, "Female"));
        Player player2 = new Player("Player2", "password2", player2Characters);
        players.add(player2);

        System.out.println("Player info before performing actions:");
        for (Player player : players) {
            player.printPlayerInfo();
            System.out.println();
        }
        for (Player player : players) {
            for (Character character : player.getCharacters()) {
                character.attack();
                character.regeneratePower();
            }
        }
        System.out.println("\nPlayer info after performing actions:");
        for (Player player : players) {
            player.printPlayerInfo();
            System.out.println();
        }
        Player highestDamagePlayer = null;
        double highestTotalDamage = 0;

        for (Player player : players) {
            double totalDamage = player.calculateTotalDamage();
            if (totalDamage > highestTotalDamage) {
                highestTotalDamage = totalDamage;
                highestDamagePlayer = player;
            }
        }

        if (highestDamagePlayer != null) {
            System.out.println("Player with highest total damage: " + highestDamagePlayer.getName());
        } else {
            System.out.println("No players found.");
        }



    }

}
