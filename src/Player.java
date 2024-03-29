import java.util.ArrayList;
public class Player {
    private String name;
    private String password;
    ArrayList<Character> characters;

    public Player(String name, String password, ArrayList<Character> characters) {
        this.name = name;
        this.password = password;
        this.characters = characters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
    public void printPlayerInfo(){
        System.out.println("Player Name: " + name);
        System.out.println("Player Characters:");
        for (Character character : characters) {
            character.printInfo();
            System.out.println();
        }
    }
    public double calculateTotalDamage() {
        double totalDamage = 0;
        for (Character character : characters) {
            totalDamage += character.calculateDamage();
        }
        return totalDamage;
    }


}
