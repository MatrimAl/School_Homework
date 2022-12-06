import java.util.Scanner;

public class ornek6116 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int f2 = input.nextInt(); // büyük bir fibonacci değeri alınır
        double a0 = (1+Math.pow(5, 0.5)); // formül uygulanır
        int f1 = (int) (f2/a0); // tam kısmı alınır. Ve bir önceki fibonacci sayısı bulunur
        int f3 = (int) (f2*a0); // tam kısmı alınır ve bir sonraki fibonacci sayısı bulunur
        System.out.println(f1 + " " + " "+f2 +" " + f3);

    }
}
