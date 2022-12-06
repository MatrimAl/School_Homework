public class ornek6112 {
    public static void main(String[] args){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int s = i + j;
                if(s==1||s==2||s==3||s==5||s==8||s==13){ //eğer basamak toplamı 1,2,3,5,8,13 sayılarından biri ise sayıyı çıktı ver
                    System.out.println(10*i+j);
                }
            }

        }
    }
}
