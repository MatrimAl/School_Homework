import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] [] A = new int [N] [N];
        int T  =0;
        for (int  i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(i+"'inci sutünun "+j+"'inci satırı");
                A[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i+j<N+1){
                    T+=A[i][j];
                }
            }
            System.out.println(T);
        }
    }
}
