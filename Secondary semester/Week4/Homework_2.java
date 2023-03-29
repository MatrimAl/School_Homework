public class Homework_2 {
    public static void main(String[] args){
        System.out.println(IntToString(123));

    }
    static int bolum = 10;
    static String result="";
    static boolean numberReverse = true;
    static int numberNew;
    public static String IntToString(int number){
        String [] numberIndex = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (number == 0){
            return result;
        }
        else if(numberReverse ) {
            while(number > 0) {
                numberNew *= 10;
                numberNew += number % 10;
                number /= 10;
            }
            numberReverse = false;

            return IntToString(numberNew);
        }

        else {

            int index = number % bolum;
            number = number / bolum;
            result += numberIndex[index] + " ";
            IntToString(number);
            return result;
        }

    }
    public static void numberReverse(int number){

    }
}
