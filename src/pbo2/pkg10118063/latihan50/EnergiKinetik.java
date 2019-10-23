/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan50;

/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KinetikBaseball ek = new KinetikBaseball();
        ek.setMassa(145);
        ek.setKecepatan(25);
        System.out.println("====Program Hitung Energi Kinetik====");
        System.out.println("Massa Baseball\t : " +ek.getMassa()+ " gram");
        System.out.println("Kecepatan Baseball : " +ek.getKecepatan()+ " m/s");
        System.out.println("Energi Kinetik\t : " +ek.hitungEnergiKinetik()+ " joule");
        System.out.println("Usaha\t\t : " +ek.hitungUsaha()+ " joule");
    }
    
}
