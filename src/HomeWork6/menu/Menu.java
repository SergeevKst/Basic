package homework6.menu;

import homework6.deck.Deck;
import homework6.port.Port;
import homework6.ship.Ship;

public class Menu {

    public static void start() {
        Ship[] ship0 = new Ship[10];
        Port port = new Port(ship0);


        Ship ship1 = new Ship("Titanik", "BigCube");
        Deck deck1 = new Deck(1);

        Ship ship2 = new Ship("Titan", "SmallCube");
        Deck deck2 = new Deck(2);

        Ship ship3 = new Ship("Tit", "SmallCube");
        Deck deck3 = new Deck(2);

        Ship ship4 = new Ship("Ti", "SmallCube");
        Deck deck4 = new Deck(1);

        Ship ship5 = new Ship("Win", "SmallConuse");
        Deck deck5 = new Deck(1);

        Ship ship6 = new Ship("Lose", "SmallCube");
        Deck deck6 = new Deck(1);

        Ship ship7 = new Ship("Crom", "BigConuse");
        Deck deck7 = new Deck(2);

        Ship ship8 = new Ship("Lom", "SmallCelindr");
        Deck deck8 = new Deck(2);

        Ship ship9 = new Ship("Brom", "BigCube");
        Deck deck9 = new Deck(2);

        Ship ship10 = new Ship("Tita", "SmallCube");
        Deck deck10 = new Deck(2);

        port.addShips(ship1, deck1);
        port.addShips(ship2, deck2);
        port.addShips(ship3, deck3);
        port.addShips(ship4, deck4);
        port.addShips(ship5, deck5);
        port.addShips(ship6, deck6);
        port.addShips(ship7, deck7);
        port.addShips(ship8, deck8);
        port.addShips(ship9, deck9);
        port.addShips(ship10, deck10);

        port.showSum();

        port.deleteShip(ship5, "Win");
    }
}

