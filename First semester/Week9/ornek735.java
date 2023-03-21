import java.util.Scanner;

public class ornek735 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        boolean check = false;
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        char[] sesli={'a','e','i','o','u'};
        String k1 = "";
        String k2 = "";
        for (int i = 0; i < txt.length(); i++) {
            for (int j = 0; j < sesli.length; j++) {
                if (txt.charAt(i)==sesli[j]){
                    k1+=txt.charAt(i);
                    check=true;
                }
            }
            if (check  == false){
                k2+=txt.charAt(i);
            }
            check = false;
        }
        System.out.println(k2);
        System.out.println(k1);
    }
}
