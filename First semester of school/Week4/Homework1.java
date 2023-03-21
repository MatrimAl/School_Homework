
package week4;

import java.util.Scanner;
public class Homework1 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        System.out.println("Sayıyı giriniz");
        int number = input.nextInt();
        int numberA = 0;
        while(number >0){
              numberA++;
              if (number%numberA==0){
                  System.out.println(numberA);
                  if (number == numberA){break;}
                  
              }
              
        }
              
    }
    
}
