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
public class Home {
    String pintu;
    String jendela;
    String atap;
    String warna;
    Integer tipe;
    
    
    void cetakInfo(){
        System.out.println("Jenis Pintu :"+pintu);
        System.out.println("Kaca Jendela :"+jendela);
        System.out.println("Warna Atap :"+atap); 
        System.out.println("Warna Rumah :"+warna); 
        System.out.println("Tipe Rumah :"+tipe); 
    }
}
