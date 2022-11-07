package homework6.container;

public class SmallConuse extends SmallContainer {
    @Override
    public double getMass() {
        return (getDendity()*Math.PI* diametrSmall *creatHeight())/3;
    }
}

