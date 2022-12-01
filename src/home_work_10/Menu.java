package home_work_10;

import java.util.Scanner;

public class Menu {
    private final Product product = new Product();
    private final Order order = new Order();

    public static void run() {

        Menu menu = new Menu();
        menu.setAdministratorOrUser();

    }

    private void setAdministratorOrUser() {

        System.out.println(SubMenu.ADMINISTRATOR_OR_USER.getText());

        int administratorOrUser = getScanner();


        if (administratorOrUser != 1 && administratorOrUser != 2) {
            System.out.println("Uncorrected chose. Try again");
            run();
        }

        switch (administratorOrUser) {
            case 1 -> {
                setPassword();
                run();
            }
            case 2 -> getUserMenu();
        }

    }


    private void setPassword() {
        System.out.println(SubMenu.ADMINISTRATOR.getText());

        int password = getScanner();

        AdminPassword adminPassword = admin -> {
            if (admin == 1111) {
                getAdminMenu();
            }
            return "Try again";
        };
        System.out.println(adminPassword.verification(password));
    }

    private void getUserMenu() {
        startForUser();
    }

    private void getAdminMenu() {
        startForAdmin();
    }


    private void startForAdmin() {

        product.cleanerList();

        final int choose = getChooseStart();

        switch (choose) {
            case 1 -> getProductLine();
            case 2 -> getOrderLine();
            case 3 -> exitProgram();
        }


    }

    private void startForUser() {

        product.cleanerList();

        final int choose = getChooseStart();

        switch (choose) {
            case 1 -> getProductLineForUser();
            case 2 -> getOrderLine();
            case 3 -> exitProgram();
        }


    }

    private void getProductLineForUser() {

        final int choose = getChooseProductForUser();

        switch (choose) {

            case 1 -> {
                product.showProductList();
                run();
            }
            case 2 -> run();
            case 3 -> exitProgram();
        }
    }

    private void getProductLine() {

        final int choose = getChooseProduct();

        switch (choose) {
            case 1 -> {
                product.createNewProduct();
                run();
            }
            case 2 -> {
                product.showProductList();
                run();
            }
            case 3 -> {
                product.deleteProduct();
                run();
            }
            case 4 -> run();
            case 5 -> exitProgram();
        }
    }

    private void getOrderLine() {

        final int choose = getChooseOrder();

        switch (choose) {
            case 1 -> {
                order.addProductToOrderList();
                run();
            }
            case 2 -> {
                System.out.println("Product list");
                product.showProductList();
                run();
            }
            case 3 -> {
                order.deleteProductInOrderList();
                run();
            }
            case 4 -> {
                order.show();
                run();
            }
            case 5 -> run();
            case 6 -> exitProgram();
        }
    }

    private int getChooseStart() {

        chooseNumberStart();

        return getScanner();
    }


    private int getChooseProduct() {

        chooseNumberProduct();

        return getScanner();
    }

    private int getChooseProductForUser() {

        chooseNumberProductForUser();

        return getScanner();
    }

    private int getChooseOrder() {

        chooseNumberOrder();

        return getScanner();
    }


    private void chooseNumberStart() {

        System.out.println(SubMenu.HELLO.getText() + getSeparator() +
                SubMenu.START_CHOOSE.getText() + getSeparator() +
                SubMenu.PRODUCT_LINE.getText() + getSeparator() +
                SubMenu.ORDER_LINE.getText() + getSeparator() +
                SubMenu.EXIT.getText());
    }

    private void chooseNumberProduct() {

        System.out.println(SubMenu.PRODUCT_CHOOSE.getText() + getSeparator() +
                SubMenu.ADD_PRODUCT.getText() + getSeparator() +
                SubMenu.WATCHING.getText() + getSeparator() +
                SubMenu.DELETE_PRODUCT.getText() + getSeparator() +
                SubMenu.RETURN.getText() + getSeparator() +
                SubMenu.EXIT_FOR_PRODUCT.getText());
    }

    private void chooseNumberProductForUser() {
        System.out.println(SubMenu.PRODUCT_LINE_FOR_USER.getText());
    }

    private void chooseNumberOrder() {

        System.out.println(SubMenu.ORDER_CHOOSE.getText() + getSeparator() +
                SubMenu.ADD_PRODUCT_IN_ORDER.getText() + getSeparator() +
                SubMenu.WATCHING.getText() + getSeparator() +
                SubMenu.DELETE_PRODUCT.getText() + getSeparator() +
                SubMenu.WATCHING_PRODUCT_ADD.getText() + getSeparator() +
                SubMenu.RETURN_FOR_ORDER.getText() + getSeparator() +
                SubMenu.EXIT_FOR_ORDER.getText());
    }

    private int getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void exitProgram() {
        System.exit(0);
    }

    private String getSeparator() {
        return System.lineSeparator();
    }
}
