import java.util.Scanner;

public class ornek740 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        int len = txt.length();
        if (len % 2 != 0) {
            len++;
        }
        Character[] harfler = new Character[len];
        for (int i = 0; i < txt.length(); i++) {
            harfler[i] = txt.charAt(i);
        }
        String sonucTxt = "";
        if (txt.length() % 2 != 0){
            harfler[harfler.length - 1] = null;
        }
        int S = 1;
        for (int i = 0; i < harfler.length/2; i++) {
            if (harfler[harfler.length/2+i] == null ){
                sonucTxt += harfler[i];
            }
            sonucTxt += harfler[harfler.length/2+i];
            sonucTxt += harfler[harfler.length/2-S];
            S++;

        }
        System.out.println(sonucTxt);
    }
}
