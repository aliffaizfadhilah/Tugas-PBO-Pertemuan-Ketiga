/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstrakdanInterface;

/**
 *
 * @author Alif
 */
abstract class Mamalia extends Hewan {

    public Mamalia(String nama, int umur) {
        super(nama, umur);
    }

    abstract void Spesies();

    void menyusui() {
        System.out.println(nama + " adalah hewan mamalia menyusui ");
    }
}
