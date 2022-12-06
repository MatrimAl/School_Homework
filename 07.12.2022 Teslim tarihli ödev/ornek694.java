import java.util.Scanner;
public class ornek694 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // terim sayısını al
        int n = input.nextInt();
        for (int i = 0; i < n; i++) { //terimlerini döndürerek çıktı ver
            System.out.println(Math.pow(2,Math.pow(2,i) )+1);
        }
    }
}
