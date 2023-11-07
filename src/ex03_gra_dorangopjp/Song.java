/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_gra_dorangopjp;

/**
 *
 * @author pj
 */
public class Song {
    private String title, artist;
    private int year;
    
    public Song(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }
    
    public void Play() {
        System.out.println("Now playing " + getTitle() + " (" + getYear() + ") by " + getArtist() + ".");
    }
    
    public void Pause() {
        System.out.println("Paused " + getTitle() + " (" + getYear() + ").");
    }
    
    // Getter and Setter Methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
