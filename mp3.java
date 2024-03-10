public class mp3 {
    private float rate_kbps;
    private float duration;
    private String artist_name;
    private  String album_name;
    private String song_name;
    private int year;

    public mp3(float rate_kbps, float duration, String artist_name, String album_name, String song_name, int year) {
        this.rate_kbps = rate_kbps;
        this.duration = duration;
        this.artist_name = artist_name;
        this.album_name = album_name;
        this.song_name = song_name;
        this.year = year;
    }



    public String calculate(){
        int fileSize = (int) ((rate_kbps/ 8) * duration); // in kilobytes
        fileSize += artist_name.length() + album_name.length() + song_name.length() + String.valueOf(year).length();
        if (fileSize >= 1024) {
            return fileSize / 1024 + " MB";
        } else {
            return fileSize + " KB";
        }
    }

    public static String[][] getAlbumsAndSongs(mp3[] mp3Files) {
        String[] albums = new String[mp3Files.length];
        int albumCount = 0;

        // Find different albums
        for (mp3 mp3File : mp3Files) {
            boolean isNewAlbum = true;
            for (int i = 0; i < albumCount; i++) {
                if (mp3File.getAlbum_name().equals(albums[i])) {
                    isNewAlbum = false;
                    break;
                }
            }
            if (isNewAlbum) {
                albums[albumCount] = mp3File.getAlbum_name();
                albumCount++;
            }
        }

        // Create 2D array
        String[][] albumsAndSongs = new String[albumCount][];

        for (int i = 0; i < albumCount; i++) {
            String albumName = albums[i];
            int songCount = 0;

            // Count number of songs in the album
            for (mp3 mp3File : mp3Files) {
                if (mp3File.getAlbum_name().equals(albumName)) {
                    songCount++;
                }
            }

            //hold songs for this album
            albumsAndSongs[i] = new String[songCount + 1];

            // Add album name
            albumsAndSongs[i][0] = albumName;

            // Add songs to the array
            int songIndex = 1;
            for (mp3 mp3File : mp3Files) {
                if (mp3File.getAlbum_name().equals(albumName)) {
                    albumsAndSongs[i][songIndex] = mp3File.getSong_name();
                    songIndex++;
                }
            }
        }

        return albumsAndSongs;
    }


    public float getRate_kbps() {
        return rate_kbps;
    }

    public void setRate_kbps(float rate_kbps) {
        this.rate_kbps = rate_kbps;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
