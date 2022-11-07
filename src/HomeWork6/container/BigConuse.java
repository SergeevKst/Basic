package homework6.container;

public class BigConuse extends BigContainer{
    @Override
    public double getMass() {
        return (getDendity()*Math.PI* diametrHeight *creatHeight())/3;
    }
}

