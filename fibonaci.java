/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

public class fibonaci {
   public static Integer fibo (int y){
       if (y==0){
           return 0;
       }
       if(y==1) {
           return 1;
       }
       return fibo(y-1)+fibo(y-2);
   }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int hasil;
            hasil=fibo(i);
            System.out.print(hasil + " ");
            
        }
    }
}
