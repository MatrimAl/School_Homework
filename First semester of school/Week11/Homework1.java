import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Kare(number);
    }
    public static void Kare(int nubmer){
        int result = 0;
        for (int i = 1; i <= nubmer; i++) {
            result = i*i;
            System.out.println(result);
        }

    }
}
