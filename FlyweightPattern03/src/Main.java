import com.example.conc.MusicPlayer;

public class Main {
    public static void main(String[] args) {

        MusicPlayer player=  new MusicPlayer();

        player.addTrack("Şarkı A", "Sanatçı A", "Rock", "Albüm A");
        player.addTrack("Şarkı B", "Sanatçı B", "Pop", "Albüm B");
        player.addTrack("Şarkı C", "Sanatçı C", "Hip Hop", "Albüm C");

        player.displayAllTracks();



    }
}