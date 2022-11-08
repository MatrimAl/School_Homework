
package week4;
import java.util.Scanner;


public class Homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numberA = 0;
        int numberB= 0;
        int numberC= 0;
        int numberD= 0;
        while(number>=numberA){
               numberB += numberA;
               if (numberA%2==0){numberC+=numberA;}
               else if(numberA%2!=0){numberD+=numberA;}
               numberA++;
        }
                System.out.println("Tüm sayıların toplamı: "+numberB);
                System.out.println(number+" Sayısına kadar olan tek sayıların toplamı: "+numberD);
                System.out.println(number+" Sayısına kadar olan çift sayıların toplamı: "+numberC);

        

    }
    
}
