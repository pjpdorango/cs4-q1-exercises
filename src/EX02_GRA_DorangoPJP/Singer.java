/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_GRA_DorangoPJP;

/**
 *
 * @author pj
 */
public class Singer {
    String name;
    int noOfPerformances = 0;
    double earnings = 0d;
    Song favoriteSong;
    
    public Singer(String _name, Song _favoriteSong) {
        name = _name;
        favoriteSong = _favoriteSong;
    }
    
    public void performForAudience(int audienceSize) {
        double performanceEarnings = audienceSize * 100;
        System.out.println("> " + name + " performed for an audience of " + audienceSize + " and gained $" + performanceEarnings + ".");
        noOfPerformances++;
        earnings += performanceEarnings;
    }
    
    public void changeFavSong(Song newFavorite) {
        System.out.println("> " + name + "'s favorite song changed from " + favoriteSong.title + " to " + newFavorite.title + ". \n");
        favoriteSong = newFavorite;
    }
    
    public void displayCurrentStats() {
        System.out.println("Name: " + name);
        System.out.println("Number of Performances: " + noOfPerformances);
        System.out.println("Total earnings: " + earnings);
        System.out.println("Favorite Song: " + favoriteSong.title + "\n");
    }
    
}
