package homework6.container;

import java.util.Random;

public abstract class Container {
    private static final int SMALL_DENSITY = 1000;
    private static final int HEIGH_DENSITY = 2000;


    public abstract double getMass();

    public int creatHeight() {
        Random random = new Random();
        return random.nextInt(90 + 1);
    }

    public int getDendity() {
        int density = creatHeight();
        int density1 = creatHeight();
        if (density > density1 || density1 == density) {
            return SMALL_DENSITY;
        } else {
            return HEIGH_DENSITY;
        }
    }
}
