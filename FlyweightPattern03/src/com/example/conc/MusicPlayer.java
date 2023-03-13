package com.example.conc;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Track> trackList= new ArrayList<>();

    private MetadataFactory factory= new MetadataFactory();

    public  void addTrack(String title, String artist, String genre, String album )
    {
        Track track= new Track(title,artist,genre,album,factory);
        trackList.add(track);
    }

    public void displayAllTracks()
    {
        for (Track track : trackList) {
            track.display();
            System.out.println();
        }

    }
}
