/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6;
 //@author BOY
public class BUBBLESORT {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                System.out.println(" A : " + arr[j-1] +" > "+" B : "+arr[j]);
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {3, 70, 45, 1, 75, 210, 7};
        System.out.println("Array before bubble sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);
        System.out.println("Array after bubble sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");}
    }
}
    



