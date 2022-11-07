package homework6.container;

public class BigCelindr extends BigContainer{
    @Override
    public double getMass() {
        return getDendity()*Math.PI* diametrHeight *creatHeight();
    }
}

