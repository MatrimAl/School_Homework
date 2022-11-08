import java.util.Scanner;
public class Homework4 {

    
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Sayı girin");
           int sayı = input.nextInt();
           int sayı2 = 0;
           int sayı3 = 0;
           boolean devam = true;
           while(devam){
                  sayı2++;
                  if (sayı2 %2 !=0){
                           sayı3 = sayı3 + sayı2;
                           devam = true;
                  }
                  else if (sayı2>sayı) {
                           System.out.println(sayı3);
                           devam= false;
                  } 
           }
    }
    
}
