/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class tugasD {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("        Boy Mart        ");
        System.out.println("");
        System.out.print("masukan nama : ");
        String nama  = scan.nextLine();
        
        int[] harga = new int[5];
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            System.out.print("masukan harga ke-" + i + " : ");
            harga[i] = scan.nextInt();
            total = total + harga[i];
        }
        System.out.println("total harga atas pembelian saudara "+nama+ " adalah : " + total);
        
        boolean promo = false;
        for (int i = 0; i < harga.length; i++) {
            if (harga[i] >= 10000) {
                promo = false;
            } else {
                promo = true;
            }
        }
        
        if (promo == true) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapatkan promo gelas cantik dari Boy Mart");
        } else {
            System.out.println("Maaf anda tidak dapat promo"); 
        }
    }
}
