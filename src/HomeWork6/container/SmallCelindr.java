package homework6.container;

public class SmallCelindr extends SmallContainer {
    @Override
    public double getMass() {
        return getDendity()*Math.PI* diametrSmall *creatHeight();
    }
}

