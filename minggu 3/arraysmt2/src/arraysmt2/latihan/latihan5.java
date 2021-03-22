/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysmt2.latihan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class latihan5 {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inputkan nama warna : ");
        lampu = scan.nextLine();
        
        switch (lampu){
            case "merah":
                System.out.println("Lampu Merah, Berhenti");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu Hijau, Silahkan Jalan");
                break;
            default:
                System.out.println("Warna Lampu Salah");
        }
    }
}
