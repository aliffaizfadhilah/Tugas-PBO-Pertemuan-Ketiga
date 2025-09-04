/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Alif
 */
// Parent class
class PerpustakaanDigital extends Perpustakaan {
    // Overriding
    @Override
    public void pinjam(String buku) {
        System.out.println("[Digital] Akses cepat ke e-book: " + buku);
    }

    @Override
    public void pinjam(String buku, int lamaHari) {
        System.out.println("[Digital] Akses e-book " + buku + " selama " + lamaHari + " hari (online).");
    }

    @Override
    public void pinjam(String[] daftarBuku) {
        System.out.println("[Digital] Akses beberapa e-book: " + String.join(", ", daftarBuku));
    }
}


