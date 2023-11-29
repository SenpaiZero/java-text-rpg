/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.text_rpg;

/**
 *
 * @author Xeb
 */
public class dragonClass {
    private int health = 0;
    
    public dragonClass()
    {
        health = 100;
    }
    
    public void damageDragon(int dmg)
    {
        health = health - dmg;
        
        if(health <= 0) health = 0;
        isDead();
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public boolean isDead()
    {
        if(health <= 0)
            return true;
        else
            return false;
    }
}
