package HomeWork6.container;

public class SmallCont extends Container{
protected int diametrSmall = 10;

    @Override
    public double getMass() {
        double massSmall = getDendity()*Math.PI* diametrSmall *creatHeight();
        return massSmall;
    }
}
