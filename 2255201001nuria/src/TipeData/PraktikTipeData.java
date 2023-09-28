/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TipeData;

/**
 *
 * @author lenovo
 */
public class PraktikTipeData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipe Data String
        String nama,nim,prodi,alamat;
        // Tipe Data Integer
        int usia;
        // Tipe Data double
        double tinggi,berat;
        
        // Mengisi Variabel
        nama = "Nuria Maulidya";
        nim = "2255201001";
        prodi = "Ilmu Komputer";
        alamat = "Ngadirenggo Wlingi";
        usia = 20;
        tinggi = 162.4;
        berat = 49.3;
        
        //Mencetak ke layar isi Variabel
        System.out.println("Nama : "+ nama);
        System.out.println("NIM : "+ nim);
        System.out.println("Program Studi : "+ prodi);
        System.out.println("Alamat : "+ alamat);
        System.out.println("Usia : "+ usia +" tahun");
        System.out.println("Tinggi Badan : "+ tinggi +" cm");
        System.out.println("Berat Badan : "+ berat +" kg");

    }
    
}
