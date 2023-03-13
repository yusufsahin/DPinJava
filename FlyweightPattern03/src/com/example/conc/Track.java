package com.example.conc;

public class Track {
    private String title;
    private String artist;
    private String genre;
    private String album;
    private MetadataFactory factory;

    public Track(String title, String artist, String genre, String album, MetadataFactory factory) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.album = album;
        this.factory = factory;
    }

    public void display()
    {
        System.out.println("Başlık: " + title);
        System.out.println("Sanatçı: " + artist);
        System.out.println("Tür: " + genre);
        System.out.println("Albüm: " + album);
        System.out.println("ID: " + factory.getID());

    }
}
