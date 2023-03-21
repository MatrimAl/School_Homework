import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         int satir = input.nextInt();
        for (int i = 0; i<satir;  satir--) {
            for (int j = satir; 0 < j; j--) {
                  System.out.print("*");
            } 
            System.out.println();
        }
}
}
