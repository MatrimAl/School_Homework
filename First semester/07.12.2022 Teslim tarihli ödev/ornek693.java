import java.util.Scanner;
public class ornek693 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // terim sayısını al
        int n = input.nextInt();
        for (int i = 0; i < n; i++) { //terimlerini döndürerek çıktı ver
            System.out.println(Math.pow(i*2,i+1));
        }
    }
}
