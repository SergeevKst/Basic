package home.work7.menu;

import home.work7.robot.Robot;
import home.work7.factory.body_parts.Body;
import home.work7.factory.body.FactoryBody;
import home.work7.factory.head.FactoryHead;
import home.work7.factory.head_parts.Head;

public class Menu {
    public static void start() {
        Robot robot = new Robot(new FactoryBody(Body.CELINDRE), new FactoryHead(Head.CICLE), "Chaki");
        System.out.println(robot);

        Robot robot1 = new Robot(new FactoryBody(Body.CELINDRE), new FactoryHead(Head.HUMAN), "Cha");
        System.out.println(robot1);

        Robot robot2 = new Robot(new FactoryBody(Body.CELINDRE), new FactoryHead(Head.CUBE), "Chan");
        System.out.println(robot2);

        Robot robot3 = new Robot(new FactoryBody(Body.CUBE), new FactoryHead(Head.CICLE), "Zoro");
        System.out.println(robot3);

        Robot robot4 = new Robot(new FactoryBody(Body.CUBE), new FactoryHead(Head.HUMAN), "Maks");
        System.out.println(robot4);

        Robot robot5 = new Robot(new FactoryBody(Body.CUBE), new FactoryHead(Head.CUBE), "Sam");
        System.out.println(robot5);

        Robot robot6 = new Robot(new FactoryBody(Body.HUMAN), new FactoryHead(Head.CUBE), "Nana");
        System.out.println(robot6);

        Robot robot7 = new Robot(new FactoryBody(Body.HUMAN), new FactoryHead(Head.CICLE), "Ichigo");
        System.out.println(robot7);

        Robot robot8 = new Robot(new FactoryBody(Body.HUMAN), new FactoryHead(Head.HUMAN), "Minato");
        System.out.println(robot8);
    }
}
