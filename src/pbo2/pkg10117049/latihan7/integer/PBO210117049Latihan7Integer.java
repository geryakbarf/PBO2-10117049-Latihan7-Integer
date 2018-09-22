/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan7.integer;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama                 : Gery Akbar Fauzi
 * Kelas                : PBO2
 * Nim                  : 10117049
 * Deskripsi Program    : Program ini berisi program untuk menampilkan jenis - 
 *                        jenis tipe data bilangan bulat   
 */
public class PBO210117049Latihan7Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //kamus pendeklarasian variabel dengan tipe data bilangan bulat
        byte b;
        short s;
        int i;
        long l;
        
        b = 120;
        s = 32767;
        i = 1_000_000_000;
        l = 90000000000L;
        
        System.out.println("byte : "+ b);
        System.out.println("short : "+ s);
        System.out.println("Int : "+ i);
        System.out.println("long : "+ l); 
    } 
}
