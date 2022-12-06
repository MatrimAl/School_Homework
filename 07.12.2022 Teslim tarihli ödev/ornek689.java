import java.util.Scanner;
public class ornek689 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayiAsal = input.nextInt();
        int s = 0;
        int k=0;
        for (int i = 2; i < sayiAsal-1; i++){
            if(sayiAsal%i==0){
                s=s+1;
            }
            if (s==0){
                k = 1;
            }
        }
        if (k==0){
            System.out.println("Girdiğiniz sayı asal değildir");
        }
        else if (k==1){
            System.out.println("Girdiğiniz sayı Chen asalıdır");
        }
    }
}
