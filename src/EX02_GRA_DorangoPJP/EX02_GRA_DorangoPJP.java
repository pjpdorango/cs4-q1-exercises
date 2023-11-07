/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EX02_GRA_DorangoPJP;

/**
 *
 * @author pj
 */
public class EX02_GRA_DorangoPJP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hollow Knight Enemies
        Enemy hornet = new Enemy("Hornet", true, 2);
        Enemy grimm = new Enemy("Grimm", true, 2);
        Enemy mantisLords = new Enemy("Mantis Lords", true, 2);
        
        System.out.println("------------------------");
        System.out.println("Hollow Knight Enemies \n");
        
        System.out.println("Enemy 1");
        System.out.println("Name: " + hornet.name);
        System.out.println("Is it a boss?: " + hornet.isBoss);
        System.out.println("How many fights are there?: " + hornet.noOfFights + "\n");
        
        System.out.println("Enemy 2");
        System.out.println("Name: " + grimm.name);
        System.out.println("Is it a boss?: " + grimm.isBoss);
        System.out.println("How many fights are there?: " + grimm.noOfFights + "\n");
        
        System.out.println("Enemy 3");
        System.out.println("Name: " + mantisLords.name);
        System.out.println("Is it a boss?: " + mantisLords.isBoss);
        System.out.println("How many fights are there?: " + mantisLords.noOfFights);        
        System.out.println("------------------------");
        
        // Singer & Song Classes
        System.out.println("\nSinger & Song Classes: ");
        Song hateMyself = new Song("Hate Myself", "dodie", 2021);
        Song absolutelySmitten = new Song("Absolutely Smitten", "dodie", 2016);
        Singer dodie = new Singer("dodie", hateMyself);
        
        dodie.displayCurrentStats();
        dodie.performForAudience(12);
        dodie.changeFavSong(absolutelySmitten);
        dodie.displayCurrentStats();
    }
    
}
