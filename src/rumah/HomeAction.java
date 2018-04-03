/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumah;

/**
 *
 * @author Windows 10
 */
public class HomeAction {
    public static void main(String[] args) {
        
        Home I = new Home();
        Home You = new Home();
        Home They = new Home();
        
        I.pintu="Kayu";
        I.jendela="Gelap";
        I.atap="Merah";
        I.warna="Merah";
        I.tipe=54;
        
        You.pintu="Kayu";
        You.jendela="Bening";
        You.atap="Biru";
        You.warna="Biru";
        You.tipe=45;
        
        They.pintu="Kayu";
        They.jendela="Bening";
        They.atap="Hijau";
        They.warna="Hijau";
        They.tipe=36;
        
        I.cetakInfo();
        You.cetakInfo();
        They.cetakInfo();
    }
}
