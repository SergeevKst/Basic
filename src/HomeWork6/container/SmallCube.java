package HomeWork6.container;

public class SmallCube extends SmallCont{
    @Override
    public double getMass() {
        double massSmalltCube = getDendity()*Math.pow(diametrSmall,3);
        return massSmalltCube;
    }
}
