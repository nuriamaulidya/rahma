/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PetaniKode;

/**
 *
 * @author lenovo
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Player petani = new Player ();
         
         petani.name = "Petani Kode";
         petani.speed = 78;
         petani.healthPoin = 100;
         
         petani.run();
         if (petani.isDead()){
             System.out.println("Game Over!");
         }
    }
    
}
