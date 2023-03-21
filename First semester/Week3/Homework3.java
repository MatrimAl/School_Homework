/*
A sayısını al
B sayısını al
C sayısını al
3 kenarı birbirine eşit olan üçgen eşkenardr
2 kenarı eşit olan üçgen ikizkenardır
tüm kenarları farklı olan üçgen çeşitkenardır
Eğer A=B ve A=C yada B=A ve B=C yada C=A ve C=B ise üçgen ikizkenardır
Eğer A=B=C ise üçgen eşitkenardır
Eğer Değerlerin hiç biri birine eşti  değilse çeşitkenardır
*/
import java.util.Scanner;
public class Homework3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk kenarı giriniz.");
        int A= input.nextInt();
        System.out.println("İkinci kenarı giriniz.");
        int B= input.nextInt();
        System.out.println("Üçüncü sayı giriniz.");
        int C= input.nextInt();
        if (A==B && A==C && B==C){System.out.println("Üçgen eşkenar");}
        else if((A==B && A==C)|| (B==A && B==C) || (C==A && C==B)){System.out.println("Üçgen ikizkenar");}
        else if (A!=B && A!=C && C!=B){System.out.println("Üçgen çeşitkenar");}
    }
    
}
