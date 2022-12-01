package home_work_10;

public enum SubMenu {
    HELLO("Hello!!!"),
    START_CHOOSE("Choose then you want to do:"),
    PRODUCT_LINE("1: work with product"),
    ORDER_LINE("2: work with order"),
    ADD_PRODUCT("1: add new product"),
    WATCHING("2: watching product list"),
    DELETE_PRODUCT("3: delete product"),
    PRODUCT_CHOOSE("You choose work with product then you want to do:"),
    RETURN("4: return"),
    ADD_PRODUCT_IN_ORDER("1: Add product in order list"),
    WATCHING_PRODUCT_ADD("4: Watching product that you add to order list"),
    RETURN_FOR_ORDER("5: return"),
    ORDER_CHOOSE("You choose work with product then you want to do:"),

    ADMINISTRATOR_OR_USER("Who are you admin or user (set your choose administrator-1 or user-2): "),

    PRODUCT_LINE_FOR_USER("1: Watching product list" + System.lineSeparator() +
            "2: return" + System.lineSeparator() +
            "3: exit"),
    ADMINISTRATOR("You should write admin password"),
    EXIT_FOR_ORDER("6: exit"),
    EXIT_FOR_PRODUCT("5: exit"),
    EXIT("3: exit");

    private final String text;

    public String getText() {
        return text;
    }

    SubMenu(String text) {
        this.text = text;
    }


}
