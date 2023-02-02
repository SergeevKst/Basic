package home.work7.robot;

import home.work7.factory.body.FactoryBody;
import home.work7.factory.head.FactoryHead;

import java.util.StringJoiner;

public class Robot {
    private final FactoryBody factoryBody;
    private final FactoryHead factoryHead;
    private final String name;

    public Robot(FactoryBody body, FactoryHead head, String name) {
        this.factoryBody = body;
        this.factoryHead = head;
        this.name = name;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Robot.class.getSimpleName() + "[", "]")
                .add("Name: " + name)
                .add("Head: " + factoryHead.created())
                .add("Body: " + factoryBody.created())
                .toString();
    }
}
