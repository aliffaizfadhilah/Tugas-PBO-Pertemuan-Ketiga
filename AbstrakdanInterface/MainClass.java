/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstrakdanInterface;

/**
 *
 * @author Alif
 */
public class MainClass {

    public static void main(String[] args) {
        LumbaLumba fraser = new LumbaLumba("Fraser", 50);
 
        System.out.println("");
        System.out.println("Detail Spesies : ");
        fraser.Spesies();
        fraser.menyusui();
        fraser.bernafas();
        fraser.habitat();
        
        System.out.println("");
        System.out.println("Karakteristik Umum : ");
        fraser.makanan();
         fraser.berat(160);
        fraser.panjang(2);
        fraser.Bentuk("Ramping dan padat");
        
        System.out.println("");
        System.out.println("Keunikan Spesies : ");
         fraser.Warna("Abu-abu kebiruan");
        fraser.Tubuh("Bermoncong Pendek");
        fraser.Perilaku("Berkelompok Besar");
       
    }
}
