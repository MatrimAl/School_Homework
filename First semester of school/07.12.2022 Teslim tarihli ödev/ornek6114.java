import java.util.Scanner;

public class ornek6114 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // terim sayısı al
        int f1 = 1;
        int F2 = -1;
        System.out.println(f1 + " " + F2 ); //ilk 2 terim
        for (int i = 1; i <=n-2 ; i++) { //girilen terim sayısının 2 eksiği kadar döndür ve çıktı ver
            int f3= f1-F2;
            System.out.println(f3);
            f1=F2;
            F2=f3;
        }

    }
}
