package homework6.container;

public class BigCube extends BigContainer{
    @Override
    public double getMass() {
        return getDendity()*Math.pow(diametrHeight,2)*creatHeight();
    }
}
