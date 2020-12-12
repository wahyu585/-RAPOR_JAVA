/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapor_java;


public class rapor_java1 {
       
    
      public static void main(String[] args) {
          
          int nilai = 10;
          
          String pesan="", Jumlah="";
          
          if (nilai>2){
              Jumlah = "lebih besar dari 2";
              if(nilai%2 == 0){
                  pesan = "bilangan genab";
              }else{
                  pesan = "bilangan ganjil";
              }
              System.out.println(Jumlah+" dan "+pesan);
                  }else{
              Jumlah = "lebih kecil dari 2";
              System.out.println(Jumlah);
          }
          
      }
    
}
