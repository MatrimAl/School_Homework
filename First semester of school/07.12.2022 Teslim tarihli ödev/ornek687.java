public class ornek687 {
    public static void main(String[] args){
        int sonuc;
        for (int i = 2; i <= 7; i++) { //onlar basamağı için bir sayı al
            for (int j = 2; j <= 7; j++) { //birler basamağı için bir sayı al
                if(i==2 || i==3 || i==5 || i==7 && j==2||j==3||j==5||j==7){ // alınan her iki sayı asal mı diye kontrol et
                    sonuc = (10*i)+j; //ikisi de asalsa 2 basamaklı sayı haline getir
                    System.out.println(sonuc); // çıktı ver
                }
            }
        }

    }
}
