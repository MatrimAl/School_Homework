import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args){
        boolean check=true;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1;  i<number; i++) {
            for (int j = 1; j <number; j++) {
                  int a = (i*i) + (j*j);
                  if (number == a){
                  System.out.println("Yazılır");
                  check = false;
                  return;
                  }
            if (check == false){return;}
            }
        }
        if (check == true){
            System.out.println("Yazılmaz");
        }
        
    }
}
