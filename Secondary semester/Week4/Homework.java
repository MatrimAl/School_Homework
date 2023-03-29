public class Homework {
    public static void main(String[] args){
        int test = muhtesemSayi(6,1);
        System.out.println(test);
    }
    static int sonuc = 0;
    public static int muhtesemSayi(int a, int b){
        if(b<a){
            if(a%b==0){
                sonuc = b+muhtesemSayi(a,b+1);
                return sonuc;
            }
            else{
                muhtesemSayi(a,b+1);
                return sonuc;
            }
        }
        else {
            return -1;
        }
    }
}
