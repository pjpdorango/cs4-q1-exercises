/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_gra_dorangopjp;

/**
 *
 * @author pj
 */
public class Enemy {
    private String name;
    private boolean isBoss;
    private int noOfFights;
    
    public Enemy(String name, boolean isBoss, int noOfFights) {
        // Initialization of variables
        this.name = name;
        this.isBoss = isBoss;
        this.noOfFights = noOfFights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsBoss() {
        return isBoss;
    }

    public void setIsBoss(boolean isBoss) {
        this.isBoss = isBoss;
    }

    public int getNoOfFights() {
        return noOfFights;
    }

    public void setNoOfFights(int noOfFights) {
        this.noOfFights = noOfFights;
    }
}
