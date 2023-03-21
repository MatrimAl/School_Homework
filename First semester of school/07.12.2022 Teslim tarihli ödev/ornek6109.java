import java.util.Scanner;

public class ornek6109 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // terim sayısı al
        int u;
        for (int i = 0; i <= n; i++) { //terim sayısına kadar tüm üçgensel sayıları bul
            u=(i*(i+1))/2;
            System.out.println(u); //çıtkı ver

        }
    }
}
