/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_gra_dorangopjp;

/**
 *
 * @author pj
 */
public class Singer {
    private String name;
    private int noOfPerformances = 0;
    private double earnings = 0d;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String name, Song favoriteSong) {
        this.name = name;
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int audienceSize) {
        double performanceEarnings = audienceSize * 100;
        System.out.println("> " + getName() + " performed for an audience of " + audienceSize + " and gained $" + performanceEarnings + ".\n");
        
        // Add Performance count and earnings
        addPerformance();
        addEarnings(performanceEarnings);
    }
    
    public void performForAudience(int audienceSize, Singer duetPartner) {
        double performanceEarnings = (audienceSize * 100) / 2;
        System.out.println("> " + getName() + " and " + duetPartner.getName() + " performed for an audience of " + audienceSize + " and gained $" + performanceEarnings + " each.\n");
        
        // Add Performance count and earnings
        addPerformance();
        addEarnings(performanceEarnings);
        
        duetPartner.addPerformance();
        duetPartner.addEarnings(performanceEarnings);
        
    }
    
    public void displayCurrentStats() {
        System.out.println("Name: " + getName());
        System.out.println("Number of Performances: " + noOfPerformances);
        System.out.println("Total earnings: " + earnings);
        System.out.println("Favorite Song: " + getFavoriteSong().getTitle() + "\n");
    }
    
    // Getter and Setter Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }
    
    public void changeFavSong(Song newFavorite) {
        System.out.println("> " + getName() + "'s favorite song changed from " + getFavoriteSong().getTitle() + " to " + newFavorite.getTitle() + ". \n");
        favoriteSong = newFavorite;
    }
    
    public void addPerformance() {
        noOfPerformances++;
        totalPerformances++;
    }
    
    public void addEarnings(double additionalEarnings) {
        earnings += additionalEarnings;
    }
    
    public static int getTotalPerformances() {
        return totalPerformances;
    }
}
