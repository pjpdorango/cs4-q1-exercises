/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX01_GRA_DorangoPJP;

/**
 *
 * @author GRAVITON
 */
public class EX01_GRA_DorangoPJP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name_1 = "Hornet";
        boolean isBoss_1 = true;
        int noOfFights_1 = 2;
       
        String name_2 = "Grimm";
        boolean isBoss_2 = true;
        int noOfFights_2 = 2;
       
        String name_3 = "Mantis Lords";
        boolean isBoss_3 = true;
        int noOfFights_3 = 2;
       
        System.out.println("My Favorite Hollow Knight Enemies \n");
       
        System.out.println("Enemy 1");
        System.out.println("Name: " + name_1);
        System.out.println("Are they a boss?: " + isBoss_1);
        System.out.println("How many fights?: " + noOfFights_1 + '\n');
       
        System.out.println("Enemy 2");
        System.out.println("Name: " + name_2);
        System.out.println("Are they a boss?: " + isBoss_2);
        System.out.println("How many fights?: " + noOfFights_2 + '\n');
       
        System.out.println("Enemy 3");
        System.out.println("Name: " + name_3);
        System.out.println("Are they a boss?: " + isBoss_3);
        System.out.println("How many fights?: " + noOfFights_3 + '\n');
       
        boolean areAllBosses = isBoss_1 && isBoss_2 && isBoss_3;
        int totalBossFights = noOfFights_1 + noOfFights_2 + noOfFights_3;
        boolean moreThanZote = totalBossFights > 12;
       
        System.out.println("Are all of them boss fights? " + areAllBosses); // Operation: And Comparisons
        System.out.println("How many boss fights are there in total? " + totalBossFights); // Operation: Addition
        System.out.println("Are there more total boss fights that Zote The Mighty fights? " + moreThanZote); // Operation: Comparisons
       
    }
   
}