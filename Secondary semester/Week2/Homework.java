import java.util.Random;
import java.util.Scanner;
public class Main {

        public static void main(String [] args){
            int[] selectionArray = new int[1000];
            int[] bubbleArray = new int[1000];
            int[] insertionArray = new int[1000];
            int[] combArray = new int[1000];
            randomArray(selectionArray);
            randomArray(bubbleArray);
            randomArray(insertionArray);
            randomArray(combArray);
            //Selection sort
            System.out.println("Before the sort: ");
            printArray(selectionArray);
            selectionSort(selectionArray);
            System.out.println("After the selection sort: ");
            printArray(selectionArray);
            //Bubble sort
            System.out.println("Before the sort: ");
            printArray(bubbleArray);
            bubbleSort(bubbleArray);
            System.out.println("After the Bubble sort: ");
            printArray(bubbleArray);
            //Insertion sort
            System.out.println("Before the sort: ");
            printArray(insertionArray);
            insertionSort(insertionArray);
            System.out.println("After the Insertion sort: ");
            printArray(insertionArray);
            //Comb sort
            System.out.println("Before the sort: ");
            printArray(combArray);
            combSort(combArray);
            System.out.println("After the Comb sort: ");
            printArray(combArray);

        }
        public static int[] selectionSort(int[] array){
            long start = System.currentTimeMillis();
            for (int i=0 ; i<array.length ; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > array[i] ){
                        int gecici = array[i];
                        array[i] = array[j];
                        array[j] = gecici;
                    }
                }
            }
            long elapsedTimeMillis = System.currentTimeMillis()-start;
            System.out.println("Selection sort time: "+ elapsedTimeMillis );
            return array;
        }
        public static int[] bubbleSort(int[] array){
            long start = System.currentTimeMillis();
            for (int i = 0; i < array.length-1; i++) {
                for (int j = 0; j < array.length-1; j++) {
                    if(array[j]>array[j+1]){
                        int gecici = array[j];
                        array[j] = array[j+1];
                        array[j+1] = gecici;
                    }
                }
            }
            long elapsedTimeMillis = System.currentTimeMillis()-start;
            System.out.println("Bubble sort time: "+ elapsedTimeMillis );
            return array;
        }
        public static int[] insertionSort(int[] array) {
            long start = System.currentTimeMillis();
            int n = array.length;
         for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
            long elapsedTimeMillis = System.currentTimeMillis()-start;
            System.out.println("Insertion sort time: "+ elapsedTimeMillis );
        return array;
         }
         public static int[] combSort(int[] array){
             long start = System.currentTimeMillis();
             int gap = array.length;
            double shrink = 1.3;
            while (gap>1){
                gap = (int) (gap/shrink);
                int i = 0;
                while (i + gap < array.length) {
                    if (array[i] > array[i + gap]) {
                        int temp = array[i];
                        array[i] = array[i + gap];
                        array[i + gap] = temp;
                    }
                    i++;
                }
            }
             long elapsedTimeMillis = System.currentTimeMillis()-start;
             System.out.println("Comb sort time: "+ elapsedTimeMillis );
            return array;
         }
         public static void printArray(int[] array){
             for (int i = 0; i < array.length; i++) {
                 System.out.print(array[i]+", ");
             }
             System.out.println();
         }
         public static int[] randomArray(int[] array){
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                 int randomNum = random.nextInt(10000);
                 array[i] = randomNum;
            }
            return array;
        }
    }
