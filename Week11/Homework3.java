public class Homework3 {
    public static void main(String[] args){
        int [] numbers = {1,3,2,10,5,8};
        int [] numbers2 = sirala(numbers);
        for(int i = 0; i < numbers2.length; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanını : " +numbers2[i]);
        }
    }
    public static int[] sirala(int[] numbers) {
        int[] siralaSayi=numbers;
        int keep;
        for (int i = 0; i < siralaSayi.length; i++) {
            for (int j = i + 1; j < siralaSayi.length; j++) {
                if (siralaSayi[j] < siralaSayi[i]) {
                    keep = siralaSayi[i];
                    siralaSayi[i] = siralaSayi[j];
                    siralaSayi[j] = keep;
                }
            }
        }
        return siralaSayi;

    }
}
