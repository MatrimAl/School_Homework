import java.util.Scanner;
public class ornek695 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = 2; i <=x; i++) {
            for (int j = 2; j <=y; j++) {
                System.out.println(Math.pow(i,j)+Math.pow(j,i));
            }

        }
    }
}
