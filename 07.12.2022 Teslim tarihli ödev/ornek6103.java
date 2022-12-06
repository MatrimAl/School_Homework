import java.util.Scanner;

public class ornek6103 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double s=0;
        float t=0;
        double ho;
        int ho2;
        for (int i = 1; i <= a; i++) { //girilen sayıya kadar tüm sayıları girilen sayıya bölmeyi dene
            if(a%i==0){
                s++;     //bölen sayısını hesaplama
                t += (Math.pow(i, -1)); //payda durumunu hesaplama
            }
        }
        ho=s/t; //son işlemi yap
        ho2= (int) ho; // sayıyı tam sayıya vuvarla
        if (ho2 == ho){ //kontrol et
            System.out.println("Ore sayısıdır");
        }
        else {
            System.out.println("Ore sayısı değildir");
        }
    }
}
