import java.util.Scanner;

public class ornek730 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen kelime grubu veya cümle giriniz");
        String a = input.nextLine();
        int len = a.length();
        if (len % 2 != 0) {
            len++;
        }
        Character[] harfler = new Character[len];
        for (int i = 0; i < a.length(); i++) {
            harfler[i] = a.charAt(i);
        }
        String sonucTxt = "";
        if (a.length() % 2 != 0){
            harfler[harfler.length - 1] = null;
        }
        int S = 1;
        for (int i = 0; i < a.length(); i+=2) {

            if (harfler[i+1] == null) {
                if (S % 2 == 1) {
                    sonucTxt += Character.toUpperCase(a.charAt(i));
                    break;
                }
                else if (S % 2 == 0) {
                    sonucTxt += Character.toLowerCase(a.charAt(i));
                    break;
                }
                break;
            }
            if (S % 2 == 1) {
                sonucTxt += Character.toUpperCase(a.charAt(i));
                sonucTxt += Character.toUpperCase(a.charAt(i + 1));
            }
            else if (S % 2 == 0) {
                sonucTxt += Character.toLowerCase(a.charAt(i));
                sonucTxt += Character.toLowerCase(a.charAt(i + 1));
            }
            S++;
        }
        System.out.println(sonucTxt);
    }
}
