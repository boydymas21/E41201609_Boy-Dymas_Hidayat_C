/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class latihan_4
{    
public static void main(String[] args) 
    {
     Scanner s1 = new Scanner(System.in);
     
        System.out.print("Masukan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukan nilai2 = ");
        int nilai2 = s1.nextInt();
     
        int jumlah = nilai1 + nilai2;
        System.out.println("jumlah = " + jumlah);
    }
}