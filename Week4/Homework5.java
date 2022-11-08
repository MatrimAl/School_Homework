package week4;

import java.util.Scanner;
import  java.lang.Math;
public class Homework5 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Kilometre (km)10-3\n" +
           "Metre (m)1\n" +
           "Desimetre (dm)10\n" +
           "Santimetre (cm)100\n" +
           "Milimetre (mm)1.000\n" +
           "Mikrometre (µm)1.000.000\n" +
           "Nanometre (nm)1.000.000.000\n" +
           "Angstrom (Å)10.000.000.000");
       System.out.println("Yapmak istediğiniz çevirmenin ismini giriniz");
       String metrik = input.nextLine();
       System.out.println("Metre cinsinden sayı giriniz");
       int number = input.nextInt();
       if (metrik.equals("Kilometre")) {
           double number2=(double) number*Math.pow(10, -3); System.out.println(number2);
       }
       if (metrik.equals("Desimetre")) {
           number*=10; System.out.println(number);
       }
       if (metrik.equals("Santimetre")) {
           number*=10^2;System.out.println(number);
       }
       if (metrik.equals("Milimetre")) {
           number*=10^3;System.out.println(number);
       }
       if (metrik.equals("Mikrometre")) {
           number*=10^6;System.out.println(number);
       }
       if (metrik.equals("Nanometre")) {
           number*=10^8;System.out.println(number);
       }
    }
}