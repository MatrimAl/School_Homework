import java.util.Scanner;
import java.util.*;
public class ornek684 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Altın üçgenin Kısa kenar uzunluğunu giriniz");
        int a = input.nextInt(); //uzunluğu al
        double b = ((a*(1+Math.pow(5,0.5))))/2; //uzun kenarı bulmak için altın oran formülü uygula
        System.out.println("Kısa kenar uzunluğu: "+a+" Uzun kenar uzunlukları: "+b); //çıtkı ver

    }
}