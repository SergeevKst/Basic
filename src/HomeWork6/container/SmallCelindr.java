package HomeWork6.container;

public class SmallCelindr extends SmallCont{
    @Override
    public double getMass() {
        double massSmallCelindr = getDendity()*Math.PI* diametrSmall *creatHeight();
        return massSmallCelindr;
    }
}
