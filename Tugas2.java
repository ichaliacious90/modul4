/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int angka;
        int balik=0;
        System.out.print("Masukkan angka : ");
        angka = input.nextInt();
        while(angka !=0) {
            balik = balik *10;
            balik= balik + angka%10;
            angka = angka/10;
        }
        System.out.print("angka yang sudah dibalik : "+balik);
        System.out.println("");
    }
    
}
