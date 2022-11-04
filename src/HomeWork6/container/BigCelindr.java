package HomeWork6.container;

public class BigCelindr extends BigCont{
    @Override
    public double getMass() {
        double massHeightCelindre = getDendity()*Math.PI* diametrHeight *creatHeight();
        return massHeightCelindre;
    }
}
