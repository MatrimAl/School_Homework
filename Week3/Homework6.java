import java.util.Scanner;
public class Homework6 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı girin");
        int sayı1 = input.nextInt();
        System.out.println("İkinci sayıyı girin");
        int sayı2 = input.nextInt();
        int n = 0;
        int p=0;
        if (sayı1 == 0 || sayı2== 0){
                p = (sayı1 - sayı1) + (sayı2 - sayı2);
        }
        else {
             while(sayı2>n){
                n++;
                p= p+sayı1;
        }
        }
        System.out.println("Sonuç: "+p);
    }
    
}
