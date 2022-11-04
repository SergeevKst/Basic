package HomeWork6.container;

public class BigCube extends BigCont{
    @Override
    public double getMass() {
        double massHeightCube = getDendity()*Math.pow(diametrHeight,3);
        return massHeightCube;
    }
}
