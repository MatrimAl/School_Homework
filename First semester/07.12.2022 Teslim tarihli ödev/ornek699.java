import java.util.Scanner;
public class ornek699 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int a1= a/10;
        int b1= b/10;
        int a0= a%10;
        int b0= b%10;
        if (a1==b1 && (a0 + b0==10)){
            System.out.println("Başdaşık sayıdır.");
        }
        else {
            System.out.println("Bağdaşık sayı değildir");
        }
    }
}
