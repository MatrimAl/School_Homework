import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Asal(number);
    }
    public static void Asal(int number){
        int sayac = 0;

        for(int i = 2; i < number; i++)
        {
            if(number% i == 0) {
                sayac++;
            }
        }

        if (number == 1){
            System.out.println(number + " Asal bir sayi degildir.");
        }
        else if(sayac == 0) {
            System.out.println(number + " Asal bir sayidir.");
        }
        else {
            System.out.println(number + " Asal bir sayi degildir.");
        }

    }
}
