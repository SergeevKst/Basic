package homework6.ship;

public class Ship {
    private String name;


    private String containerType;

    public Ship(String name, String containerType) {
        this.name = name;
        this.containerType = containerType;
    }

    public String getContainerType() {
        return containerType;
    }

    public String getName() {
        return name;
    }


}
