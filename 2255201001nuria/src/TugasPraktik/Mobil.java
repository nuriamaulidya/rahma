/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktik;

/**
 *
 * @author lenovo
 */
public class Mobil {

        String warna = "Putih";
        String tipe = "Sedan";
    
        void maju(){
        System.out.println("Mobil " + tipe + "warna " + warna + "bergerak maju");
    }
        void mundur(){
        System.out.println("Mobil " + tipe + "warna " + warna + "bergerak mundur");
    }
    public static void main(String[] args){
        
             MasterMobil vios = new MasterMobil();
            
        vios.berjalan();
        vios.berhenti();
    }
    
}
