/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_GRA_DorangoPJP;

/**
 *
 * @author pj
 */
public class Enemy {
    String name;
    boolean isBoss;
    int noOfFights;
    
    public Enemy(String _name, boolean _isBoss, int _noOfFights) {
        // Initialization of variables
        name = _name;
        isBoss = _isBoss;
        noOfFights = _noOfFights;
    }
}
