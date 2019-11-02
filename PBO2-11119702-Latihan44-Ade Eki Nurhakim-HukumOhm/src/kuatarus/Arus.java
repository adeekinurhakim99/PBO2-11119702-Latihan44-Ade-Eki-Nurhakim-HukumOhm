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
public class Arus {
    private float kuatArus;
    private float hambatan;
    public Arus(float kuatArus, float hambatan){
       kuatArus =3;
       hambatan =12;
    }

    Arus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;  
    }
    public float hitungTegangan(){
        return kuatArus*hambatan;
    }
}
