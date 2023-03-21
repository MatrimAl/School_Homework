import java.util.Scanner;
import java.util.*;
public class ornek685 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğru parçasının uzunluğunu giriniz");
        int ab = input.nextInt(); //uzunluğu al
        double cb = ab/(2+(Math.pow(2,0.5))); //cb yi bulmak için gümüş oran formülü uygula
        double ac = ab-cb; //cb den ilerleyerek kalan uzunluğu bul
        System.out.println("Gümüş orana göre bölünen 2 uzunlık AC: "+ac+"CB: "+cb);

    }
}