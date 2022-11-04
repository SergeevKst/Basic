package HomeWork6.container;

public class BigCont extends Container{
    protected int diametrHeight = 20;
    @Override
    public double getMass() {
        double massHeight = getDendity()*Math.PI* diametrHeight *creatHeight();
        return massHeight;
    }
}
