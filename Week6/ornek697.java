import java.util.Scanner;

public class ornek697 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int ta= 0;
        int tb= 0;
        for (int i = 1; i < a-1; i++) {
            if (a % i == 0){
                ta+=i;
            }
        }
        for (int i = 0; i < b-2; i++) {
            if (b % i == 0){
                tb+=1;
            }
        }
        if (ta==b && tb==a){
            System.out.println("Dost sayı");
        }
        else {
            System.out.println("Dost sayı değil");
        }
    }
}
