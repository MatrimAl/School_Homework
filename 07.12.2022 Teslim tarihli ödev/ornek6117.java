import java.util.Scanner;

public class ornek6117 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // terim sayısını al
        int P1 = 0;
        int P2 = 1;
        System.out.println(P1 +" "+P2);
        for (int i = 1; i <N-2 ; i++) { // terim sayısına kadar döngüyü döndür
            int P3 = 2*P2+P1;       //formülleri uygula ve çıktı ver
            System.out.println(P3);
            P1 = P2;
            P2 = P3;

        }
    }
}
