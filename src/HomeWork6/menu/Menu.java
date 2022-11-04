package HomeWork6.menu;

import HomeWork6.container.*;
import HomeWork6.deck.Deck;
import HomeWork6.port.Port;
import HomeWork6.ship.Ship;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    Port port = new Port();
    Ship ship = new Ship("Tita","SmallCube");
    Deck deck = new Deck(2);
    Ship ship1 = new Ship("afd","BigCube");
    public void start() {
        port.addShips(ship);
        port.addShips(ship1);
        System.out.println(getMass());

    }

    public double getMass() {
        if (ship.getContainerType().equals("SmallCube")) {
            SmallCube smallCube = new SmallCube();
            return smallCube.getMass()*getValueDeck();
        } else if (ship.getContainerType().equals("SmallConuse")) {
            SmallConuse smallConuse = new SmallConuse();
            return smallConuse.getMass()*getValueDeck();
        } else if (ship.getContainerType().equals("SmallCelindr")) {
            SmallCelindr smallCelindr = new SmallCelindr();
            return smallCelindr.getMass()*getValueDeck();
        } else if (ship.getContainerType().equals("BigCube")) {
            BigCube bigCube = new BigCube();
            return bigCube.getMass()*getValueDeck();
        } else if (ship.getContainerType().equals("BigConuse")) {
            BigConuse bigConuse = new BigConuse();
            return bigConuse.getMass()*getValueDeck();
        } else {
            BigCelindr bigCelindr = new BigCelindr();
            return bigCelindr.getMass()*getValueDeck();
        }

    }
    public int getValueDeck() {
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

