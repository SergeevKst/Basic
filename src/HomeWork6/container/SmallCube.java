package homework6.container;

public class SmallCube extends SmallContainer {
    @Override
    public double getMass() {
        return getDendity()*Math.pow(diametrSmall,2)*creatHeight();
    }
}

