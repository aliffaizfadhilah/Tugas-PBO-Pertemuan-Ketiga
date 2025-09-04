/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstrakdanInterface;

/**
 *
 * @author Alif
 */
public class LumbaLumba extends Laut implements UkuranTubuh, Keunikan, Karakteristik {

    public LumbaLumba(String nama, int umur) {
        super(nama, umur);
        System.out.println("Info Umum : ");
        info();
    }

    @Override
    public void Perilaku(String perilaku) {
        System.out.println(nama + "memiliki perilaku " + perilaku);
    }

    @Override
    public void Tubuh(String tubuh) {
        System.out.println(nama + " memiliki keunikan " + tubuh);
    }

    @Override
    public void Bentuk(String bentuk) {
        System.out.println(nama + " memiliki bentuk " + bentuk);
    }

    @Override
    public void Warna(String warna) {
        System.out.println(nama + " memiliki warna  " + warna);
    }

    @Override
    void makanan() {
        System.out.println(nama + " biasanya memakan ikan kecil dan udang-udangan ");
    }

    @Override
    void habitat() {
        System.out.println(nama + " memiliki habitat di laut bebas ");
    }

    @Override
    void Spesies() {
        System.out.println(nama + " adalah salah satu spesies mamalia berjenis lumba-lumba");
    }

    @Override
    public void berat(int kilo) {
        System.out.println(nama + " mempunyai berat sebesar " + kilo + " kg");
    }

    @Override
    public void panjang(int meter) {
        System.out.println(nama + " mempunyai panjang sebesar " + meter + " m");
    }
}
