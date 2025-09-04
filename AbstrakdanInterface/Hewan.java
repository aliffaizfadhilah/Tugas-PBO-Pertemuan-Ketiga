/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AbstrakdanInterface;

/**
 *
 * @author Alif
 */
abstract class Hewan {

    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    abstract void makanan();

    void info() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");
    }
}
