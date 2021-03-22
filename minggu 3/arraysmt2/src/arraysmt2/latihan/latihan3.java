/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysmt2.latihan;

/**
 *
 * @author USER
 */
public class latihan3 {
    public static void main(String[] args) {
        {
        int[][]angka = {
            {5,4,2,1,5},
            {9,6,5,7,8},
            {5,2,1,5,10},             
        };

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(angka[i][j]+" ");
            }
            System.out.println();
        }
    }
  }
}

