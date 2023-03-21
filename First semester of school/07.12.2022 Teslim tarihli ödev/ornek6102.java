import java.util.Scanner;

public class ornek6102 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int b;
        int c;
        for (int a = 1; a <= N; a++) { //üst sınıra kadar işlemleri  yap ve çıktı ver
            b= a+1;
            c= a*(a+1);
            System.out.println(a +" "+ b+" "+c);
        }
    }
}
