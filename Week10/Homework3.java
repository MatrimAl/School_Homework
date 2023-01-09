import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] [] A = new int [N] [N];
        int [] B = new int [N];
        int Sayac = 0;
        for (int  i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(i+"'inci sutünun "+j+"'inci satırı");
                A[i][j] = input.nextInt();
            }
        }
        for (int  i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == A[j][i]){
                    Sayac++;
                }
            }
        }
        if (Sayac == N){
            System.out.println("Simetriktir");
        }
        else {
            System.out.println("Simetrik değildir");
        }

    }
}
