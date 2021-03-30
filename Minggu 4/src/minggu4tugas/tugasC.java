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
public class tugasC {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] array; 
        int nr, max, min, sum = 0, count = 0; 
        int average = 0; 

        System.out.print("Masukkan banyaknya data nilai : ");
        nr = sc.nextInt(); 
        array = new int[nr]; 
        
        for(int i=0;i<array.length;i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");            
            array[i] = sc.nextInt();
        }

        max = array[0]; 
        min = array[0]; 
        for(int i=0;i<array.length;i++){
            sum += array[i]; 
            count++; 
            if(array[i] > max){ 
                max = array[i];
            }else if(array[i] < min){ 
                min = array[i];
            }
        }

        System.out.println("Nilai minimum  = " + min); 
        System.out.println("Nilai maksimum  = " + max); 

        average = sum / count; 
        System.out.println("Nilai rata ratanya adalah = " + average); 
    }
}