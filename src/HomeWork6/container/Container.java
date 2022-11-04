package HomeWork6.container;

import java.util.Random;

public class Container {
    private static final int SMALLDENSITY = 1000;
    private static final int HEIGHDENSITY = 2000;


    public int  creatHeight() {
        Random random = new Random();
        return random.nextInt(90 + 1);
    }
    public double getMass(){
        return 0;
    }
    public int getDendity(){
        int density = creatHeight();
        int density1 = creatHeight();
        if (density>density1|| density1==density) {
            return SMALLDENSITY;
        }else {
            return HEIGHDENSITY;
        }
    }
}
