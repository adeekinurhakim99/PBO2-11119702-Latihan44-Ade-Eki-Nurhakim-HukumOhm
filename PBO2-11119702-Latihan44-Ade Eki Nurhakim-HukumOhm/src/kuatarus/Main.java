/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuatarus;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        Arus ar = new Arus();
        System.out.println("====== Hukum Ohm =====");
        System.out.println("Kuat Arus Yang Mengalir Pada Suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar");
        System.out.println("asalkan suhu kawat dijaga kosntan");
        
        System.out.println("Kuat Arus : "+ar.getKuatArus());
        System.out.println("Hambatan : "+ar.getHambatan());
        System.out.println("Hasil Tegangan : "+ar.hitungTegangan());
    }
}
