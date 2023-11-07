/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_GRA_DorangoPJP;

/**
 *
 * @author pj
 */
public class Song {
    String title, artist;
    int year;
    
    public Song(String _title, String _artist, int _year) {
        title = _title;
        artist = _artist;
        year = _year;
    }
    
    public void Play() {
        System.out.println("Now playing " + title + " (" + year + ") by " + artist + ".");
    }
    
    public void Pause() {
        System.out.println("Paused " + title + " (" + year + ").");
    }
}
