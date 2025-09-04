/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Alif
 */

public class Main {
    public static void main(String[] args) {
        
        Perpustakaan p = new Perpustakaan();
        
        PerpustakaanDigital pd = new PerpustakaanDigital();

        System.out.println("=== Perpustakaan Konvensional ===");
        p.pinjam("Laskar Pelangi");
        p.pinjam("Bumi Manusia", 14);
        p.pinjam(new String[]{"Sapiens", "Atomic Habits"});

        System.out.println("\n=== Perpustakaan Digital ===");
        pd.pinjam("Harry Potter");
        pd.pinjam("The Hobbit", 7);
        pd.pinjam(new String[]{"1984", "To Kill a Mockingbird"});
    }
}
