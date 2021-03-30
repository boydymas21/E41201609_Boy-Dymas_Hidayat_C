/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4tugas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class tugasA {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);

        int pilihan, awal, akhir;
    
        System.out.print("Masukan Nilai Awal : ");
        awal=input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir=input.nextInt();

        
                    System.out.println("Deret Bilangan Ganjil");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2!=0)
                        System.out.println("-"+i);
                    }
                    System.out.println("Deret Bilangan Genap");
                    for(int j=awal;j<=akhir;j++){
                        if (j%2==0)
                        System.out.println("-"+j);
                    } 

        }

    }




