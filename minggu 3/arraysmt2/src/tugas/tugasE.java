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
public class tugasE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("        BOY Cafe        ");
        System.out.println("------------------------");
        System.out.println("          Menu          ");
        System.out.println("------------------------");
        String[] menu = {"Original Blend", "Robusta", "Arabica", "v60", "Green Tea Latte"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
        System.out.println("------------------------");
        
        String nama;
        System.out.print("masukan nama pembeli : ");
        nama = scan.nextLine();
        System.out.println("");
        System.out.print("Masukan Nomer Pesanan : ");
        int aa = scan.nextInt();
        String pesanan = "";
        switch (aa) {
            case 1:
                pesanan = "Original Blend";
                break;
            case 2:
                pesanan = "Robusta";
                break;
            case 3:
                pesanan = "Arabica";
                break;
            case 4:
                pesanan = "v60";;
                break;
            case 5:
                pesanan = "Green Tea Latte";
                break;
            default:
                System.out.println("pilihan anda tidak ada di menu");
                break;
        }

        System.out.println("Minuman yang anda pilih : " + pesanan);
        System.out.println("Pesanan anda akan segera kami antar");
        System.out.println("Terima Kasih " + nama + " telah memesan di BOY Cafe");
        
    }
}