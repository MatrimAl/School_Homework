
package week4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int point = input.nextInt();
         int pointResult=point*point-5*point+3;
       
         if (pointResult<0){ System.out.println("-1");}
         else if (pointResult==0){ System.out.println("0");}
         else if (pointResult>0){ System.out.println("1");}
        
    }
    
}
