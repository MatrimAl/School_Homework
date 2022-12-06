
public class ornek6104 {
    public static void main(String[] args ){
        for (int x = 1; x <=50 ; x++) {
            for (int y = 1; y <= 50; y++) {
                for (int z = 1; z <= 50 ; z++) {
                    if(x*x+y*y+z*z==3*x*y*z){
                        System.out.println(x+" "+y+" "+z);
                    }

                }

            }

        }

    }
}
