import java.util.Scanner;

public class ornek6115 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int T1=1;
        int T2=1;
        int T3=2;
        for (int i = 1; i < N-3; i++) {
            int T4=T1+T2+T3;
            System.out.println(T4);
            T1=T2;
            T2=T3;
            T3=T4;

        }
    }
}
