import java.util.Scanner;

public class ornek6107 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz."); //input al
        int N = input.nextInt();
        double sonuc = Math.pow(9*10, ((N-1)/2)); //işelm yap
        System.out.println(sonuc); //çıktı ver
    }
}
