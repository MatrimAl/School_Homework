import java.util.Scanner;

public class ornek6113 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int f1 = 1;
        int f2 = 1;
        int s2 = 0;
        while(s2<N){ //terim sayısı boyunca döngüyü sürdür
            int f3 = f1+f2; // 3 satır boyunca fibancco sayılarını elde et
            f1=f2;
            f2=f3;
            int s1=0;
            for (int i = 2; i <f3-1 ; i++) { // asallık durumunu kontrol et
                if (f3%i==0){
                    s1++;
                }
            }
            if (s1==0){ //asal ise çıktı ver
                s2++;
                System.out.println(f3);
            }
        }
    }
}
