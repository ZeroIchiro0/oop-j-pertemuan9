/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg901;

/**
 *
 * @author ZeroIchiro0
 * Tgl: Jumat, 16 Mei 2025
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mhsturunan rahma = new mhsturunan();
        rahma.setNIM("11111111");
        rahma.setJKEL("L");
        rahma.setNAMA("ZeroIchiro");
        
        System.out.println("Data Mahasiswa");
        System.out.printf("Nama         : %s\n", rahma.nama);
        System.out.printf("NIM          : %s\n", rahma.getNIM());
        System.out.printf("Jenis Kelamin: %s\n", rahma.getJKEL());
    }
    
}
