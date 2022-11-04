package HomeWork6.container;

public class SmallConuse extends SmallCont{
    @Override
    public double getMass() {
        double massSmallConuse = (getDendity()*Math.PI* diametrSmall *creatHeight())/3;
        return massSmallConuse;
    }
}
