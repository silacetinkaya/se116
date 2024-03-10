public class main {

    public static void main(String[] args) {
        mp3[] mp3Files = new mp3[4];
        mp3Files[0] = new mp3(128, 180, "Uriah Heep", "Demons and Wizards", "The Wizard", 1972);
        mp3Files[1] = new mp3(128, 240, "Uriah Heep", "Demons and Wizards", "Traveller in Time", 1972);
        mp3Files[2] = new mp3(128, 210, "Jethro Tull", "Heavy Horses", "Heavy Horses", 1978);
        mp3Files[3] = new mp3(128, 300, "Rainbow", "Ritchie Blackmore’s Rainbow", "The Temple of the King", 1975);




        String[][] albums = mp3.getAlbumsAndSongs(mp3Files);

        for (String[] album : albums) {
            for (String item : album) {
                System.out.print(item + " ");
            }
            System.out.println();
        }


        String[][] arr = new String[albums.length][];


    }
}
