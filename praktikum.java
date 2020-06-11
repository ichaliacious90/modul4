/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author ADMIN
 */
public class praktikum {
   static int faktorial (int i) {
       if(i==0) 
           return 1;
       return i*faktorial(i-1);
   } 
    public static void main(String[] args) {
        System.out.println(faktorial(4));
    }
}
