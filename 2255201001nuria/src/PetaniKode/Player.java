/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PetaniKode;

/**
 *
 * @author lenovo
 */
public class Player {
        String name;
        int speed;
        int healthPoin;
        
        void run(){
            System.out.println(name + " is running...");
            System.out.println("Speed " + speed);
        }
        
        boolean isDead(){
            if (healthPoin <=0) return true;
            return false;
        }
    }