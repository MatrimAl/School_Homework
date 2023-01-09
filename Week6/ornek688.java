import java.util.Scanner;

public class ornek688 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 2;
        while (a>1){
            if (a % b == 0){
                System.out.println(b);
                a = a / b;
            }
            else {
                b+=1;
            }
        }
    }
}
