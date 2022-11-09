package home.work7.factory.head;

import home.work7.factory.head_parts.Head;
import home.work7.technology.Technology;

public class FactoryHead implements Technology<Head> {
    Head head;

    public FactoryHead(Head head) {
        this.head = head;
    }

    @Override
    public Head created() {
        return head;
    }
}
