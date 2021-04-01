/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4tugas;

/**
 *
 * @author USER
 */
public class tugasB {
    public static void main(String[] args) {
        int i = 0;
        int j = 100;
        int kelipatan;
        System.out.println("        Do_While        ");
        System.out.println("bilangan kelipatan 2 (0-100)");
        System.out.println("============================");
        
        do{
            kelipatan = i+=2;
            System.out.print(kelipatan+" ");
        }while (i<=j);
    }
}

