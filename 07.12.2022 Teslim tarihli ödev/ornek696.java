import java.util.Scanner;
public class ornek696 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        if(sayi%4==1){
            System.out.println("Uygun");
        }
        else {
            System.out.println("Uygun değil");
        }

    }
}
