/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstrakdanInterface;

/**
 *
 * @author Alif
 */
abstract class Laut extends Mamalia {

    public Laut(String nama, int umur) {
        super(nama, umur);
    }

    abstract void habitat();

    void bernafas() {
        System.out.println(nama + " adalah hewan yang bernafas menggunakan insang ");
    }
}
