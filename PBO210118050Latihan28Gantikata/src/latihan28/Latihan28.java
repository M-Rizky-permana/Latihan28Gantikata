/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan28;

import java.util.Scanner;

/**
 *
 * NAMA :Muhamad Rizky Permana
KELAS : IF-2
NIM : 10118050
Deskripsi Program :
 */
public class Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kata = scan.nextLine();
        System.out.print("Ganti Kata : ");
        String kataawal = scan.nextLine();
        System.out.print("Menjadi Kata : ");
        String katabaru = scan.nextLine();
        String ganti = kata.replace(kataawal, katabaru);
        
        System.out.println("");
        System.out.println("Kalimat Awal : "+kata);
        System.out.println("Kalimat Baru : "+ganti);
    }
    
}
