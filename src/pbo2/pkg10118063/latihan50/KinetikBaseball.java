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
public class KinetikBaseball {
    private double massa, kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik(){
        return 0.5 * (massa/1000) * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha(){
        return hitungEnergiKinetik();
        //karena dimulai dari keadaan diam maka usaha = energi kinetik
        //usaha = EK2 - EK1 
        //EK1 = Energi Kinetik awal, jika dimulai dari keadaan diam berarti EK1 = 0
    }
}
