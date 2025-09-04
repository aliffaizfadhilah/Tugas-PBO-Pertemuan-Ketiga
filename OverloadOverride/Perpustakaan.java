/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Alif
 */
class Perpustakaan {
    // Overloading
    public void pinjam(String buku) {
        System.out.println("Meminjam buku: " + buku);
    }

    public void pinjam(String buku, int lamaHari) {
        System.out.println("Meminjam buku: " + buku + " selama " + lamaHari + " hari");
    }

    public void pinjam(String[] daftarBuku) {
        System.out.println("Meminjam beberapa buku: " + String.join(", ", daftarBuku));
    }
}
