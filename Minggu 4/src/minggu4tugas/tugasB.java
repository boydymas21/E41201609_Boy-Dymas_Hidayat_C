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
        int i = 1;
        int j = 100;
        System.out.println("        Do_While        ");
        System.out.println("bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        do{
            System.out.print(i+"   ");
            i*=2;
        }while (i<=j);
    }
}

