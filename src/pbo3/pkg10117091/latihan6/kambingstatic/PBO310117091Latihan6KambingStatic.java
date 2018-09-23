/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan6.kambingstatic;

/* @author
* NAMA  : DIDA HANDIAN
* KELAS : PBO3
* NIM   : 10117091
* Deskripsi Program : Dalam program ini berisi cotoh penggunaan dua public class
*/
public class PBO310117091Latihan6KambingStatic {

    // NAMA_KAMBING sebgai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + 
                Mamalia.jumlahKambing);
    }
    
}
