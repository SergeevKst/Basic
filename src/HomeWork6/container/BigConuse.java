package HomeWork6.container;

public class BigConuse extends BigCont{
    @Override
    public double getMass() {
        double massHeightConuse = (getDendity()*Math.PI* diametrHeight *creatHeight())/3;
        return massHeightConuse;
    }
}
