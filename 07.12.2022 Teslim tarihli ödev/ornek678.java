import java.util.Scanner;

public class ornek678 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Terim sayısını giriniz.");  // terim sayısını al
        int x = input.nextInt();
        int y = 0;
        for (int i = 1; i <= x ; i++) {
            int z = 4*i*i;
            y = y*z/(z-1);
        }
        y=2*y;
        System.out.println("Pi değeri: "+y);
    }
}