import java.util.Random;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        star(number);
    }
    public static void star(int input) {
        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
