package homework6.port;

import homework6.container.*;
import homework6.deck.Deck;
import homework6.ship.Ship;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Port {
    private Ship[] ship;

    private long[] allMass = new long[10];

    public Port(Ship[] ship) {
        this.ship = ship;
    }

    public void addShips(Ship ship, Deck deck) {
        for (Ship i : this.ship)
            if (i == null) {
                i = ship;
            }

        for (int i = 0; i < allMass.length; i++) {
            allMass[i] = getValidMass(ship, deck);
        }
    }

    public void showSum() {
        long mass = 0;
        for (int i = 0; i < allMass.length; i++) {
            mass += allMass[i];
        }
        System.out.println(mass + " :tonn of water in the port");
    }

    public void deleteShip(Ship ship, String name) {
        if (name.equals(ship.getName())) {
            ship = null;
        }
    }

    public long getValidMass(Ship ship, Deck deck) {
        return (long) (getMass(ship, deck)) / 1000;
    }

    public double getMass(Ship ship, Deck deck) {
        if (ship.getContainerType().equals("SmallCube")) {
            SmallCube smallCube = new SmallCube();
            return smallCube.getMass() * getValueDeck(deck, ship);
        } else if (ship.getContainerType().equals("SmallConuse")) {
            SmallConuse smallConuse = new SmallConuse();
            return smallConuse.getMass() * getValueDeck(deck, ship);
        } else if (ship.getContainerType().equals("SmallCelindr")) {
            SmallCelindr smallCelindr = new SmallCelindr();
            return smallCelindr.getMass() * getValueDeck(deck, ship);
        } else if (ship.getContainerType().equals("BigCube")) {
            BigCube bigCube = new BigCube();
            return bigCube.getMass() * getValueDeck(deck, ship);
        } else if (ship.getContainerType().equals("BigConuse")) {
            BigConuse bigConuse = new BigConuse();
            return bigConuse.getMass() * getValueDeck(deck, ship);
        } else {
            BigCelindr bigCelindr = new BigCelindr();
            return bigCelindr.getMass() * getValueDeck(deck, ship);
        }

    }

    public int getValueDeck(Deck deck, Ship ship) {
        Pattern pattern = Pattern.compile("S");
        Matcher matcher = pattern.matcher(ship.getContainerType());
        if (deck.getDeckSystem() == 1 && matcher.find()) {
            return 4;
        } else if (deck.getDeckSystem() == 1 && matcher.find()) {
            return 2;
        } else if (deck.getDeckSystem() == 2 && matcher.find()) {
            return 8;
        } else {
            return 4;
        }
    }


}
