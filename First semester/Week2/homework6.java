


import java.util.Scanner;
public class homework6 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu kilogram(kg) cinsinden giriniz: ");
        double kullanıcıKilo = input.nextDouble();
        System.out.println("Boyunuzu metre(m) cinsinden giriniz: ");
        double kullanıcıBoy = input.nextDouble();
        double vki = kullanıcıKilo / (kullanıcıBoy * kullanıcıBoy);
        System.out.println("Vücut kitle indeksiniz: "+ vki);
        if (vki < 18.5) {
           
                    System.out.println("Düşük kilo");
        }
        else if ( 18.5 <= vki && vki < 25.0 ) {
            System.out.println("Normal kilo");
    }
        else if( 25.0 <= vki && vki < 29.99) {
            System.out.println("Fazla kilo");
        }
        else {
            System.out.println("Obez");

        }
        }
 
    }


