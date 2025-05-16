/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg901;

/**
 *
 * @author ZeroIchiro0
 * Tgl: Jumat, 16 Mei 2025
 */
public class mahasiswa {
    private String nim, jkel; 
    protected String nama;
    
    public void setNIM(String nval){
        this.nim = nval;
    }
    
    public void setJKEL(String nval){
        this.jkel = nval;
    }
    
    public String getNIM(){
        return this.nim;
    }
    
    public String getJKEL(){
        return this.jkel;
    }
}
