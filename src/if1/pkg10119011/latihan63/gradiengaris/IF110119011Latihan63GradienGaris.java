/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan63.gradiengaris;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan63GradienGaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1 = new Koordinat (2, 5, 10, 7);
        System.out.println("Garis yang melalui titik (2,10) dan (5,7) memiliki gradien sebesar " + koordinat1.hitungGradien());
        
        Koordinat koordinat2 = new Koordinat (5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (5,1) dan (3,12) memiliki gradien sebesar " + koordinat2.hitungGradien());
    }
    
    
}
