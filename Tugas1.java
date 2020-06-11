/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;
import java.util.Scanner;
public class Tugas1 {
    static int move=1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan jumlah cakram : ");
        int cakram = in.nextInt();
        hanoi(cakram,'A','B','C');
    }
 
   static void hanoi(int cakram, char awal, char bantu,char tujuan) {
       if (cakram>=1) {
          hanoi (cakram-1,awal,tujuan,bantu);
          move(cakram,awal,tujuan);
          hanoi(cakram-1,bantu,awal,tujuan);
       }
   } 
   static void move (int step, char awal, char tujuan) {
       System.out.println("Langkah "+move);
       move++;
       System.out.print("pindahkan cakram "+step);
       System.out.print("dari "+awal);
       System.out.println("ke  "+tujuan);
   }
}
