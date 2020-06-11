/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import java.util.Scanner;
public class FaktorialDinamis {
 static int faktorial(int num) {
     if(num==0){
         return 1;
     }
     return num*faktorial(num-1);
 }
    public static void main(String[] args) {
        int bil, hasil;
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        bil= input.nextInt();
        hasil = faktorial(bil);
        System.out.println("hasil :"+hasil);
    }
}
