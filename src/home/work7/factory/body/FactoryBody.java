package home.work7.factory.body;

import home.work7.factory.body_parts.Body;
import home.work7.technology.Technology;

public class FactoryBody implements Technology<Body> {
    private final Body body;

    public FactoryBody(Body body) {
        this.body = body;
    }


    @Override
    public Body created() {
        return body;
    }

}
