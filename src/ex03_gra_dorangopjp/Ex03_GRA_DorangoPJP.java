/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03_gra_dorangopjp;

/**
 *
 * @author pj
 */
public class Ex03_GRA_DorangoPJP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hollow Knight Enemies
        Enemy hornet = new Enemy("Hornet", true, 2);
        Enemy grimm = new Enemy("Grimm", true, 2);
        Enemy mantisLords = new Enemy("Mantis Lords", true, 2);
        
        // Singer & Song Classes
        System.out.println("\nSinger & Song Classes: ");
        
        Song hateMyself = new Song("Hate Myself", "dodie", 2021);
        Song absolutelySmitten = new Song("Absolutely Smitten", "dodie", 2016);
        Song allFutile = new Song("It's All Futile! It's All Pointless!", "LoveJoy", 2021);
        
        Singer dodie = new Singer("dodie", hateMyself);
        Singer phoebe = new Singer("Phoebe Bridgers", allFutile);
        
        dodie.displayCurrentStats();
        phoebe.displayCurrentStats();
        dodie.performForAudience(12);
        dodie.changeFavSong(absolutelySmitten);
        dodie.performForAudience(12, phoebe);
        dodie.displayCurrentStats();
        phoebe.displayCurrentStats();
        
        System.out.println("Total Number of Performances by Singers: " + Singer.getTotalPerformances());
    }
    
}
