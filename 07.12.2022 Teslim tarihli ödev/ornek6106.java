public class ornek6106 {
    public static void main(String[] args){
        int sonuc;
        for (int i = 0; i < 9;  i++ ) {
            for (int j = 0; j < 9;j++) {
                sonuc = 100*i+10*j+i;
                System.out.println(sonuc);
            }
        }
        for (int i = 0; i < 9;i++) {
            for (int j = 0; j < 9;j++) {
                sonuc= 1000*i+100*j+10*j+i;
            }
        }
    }
}
