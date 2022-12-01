package home_work_10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;

public class Order {

    private String indexer;
    private final List<String> listProduct = new ArrayList<>();
    private String data;


    public void addProductToOrderList() {

        info(" Write product then you want add to order list");

        String nameProduct = getScanner();

        addToList(nameProduct);

    }


    public void deleteProductInOrderList() {

        info("If you want delete product in order list write his name: ");

        String name = getScanner();
        try {
            ifUncorectedGetnameExcepton(name);
            delete(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void show() {
        toList();
        listProduct.forEach(System.out::println);
    }

    private void delete(String name) throws IOException {
        List<String> list = Files.lines(Path.of("resourcesorder", "orderlist.txt"))
                .filter(string -> !string.contains(name))
                .toList();
        Files.write(getOrderPath(), list);
    }

    private void ifUncorectedGetnameExcepton(String name) throws IOException {

        boolean resourcesproduct = Files.lines(Path.of("resourcesorder", "orderlist.txt"))
                .anyMatch(string -> string.contains(name));
        if (!resourcesproduct) {
            try {
                throw new UnCorrectNameException("Uncorrected name");
            } catch (UnCorrectNameException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void toList() {
        Path path = getOrderPath();
        try {
            List<String> stringList = new ArrayList<>(Files.readAllLines(path));
            for (String s : stringList) {
                String[] line = s.split(" ");
                listProduct.add(line[1]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addToList(String nameProduct) {

        Path path = getProductPath();

        setData();

        setIndexer();

        try {
            List<String> stringList = new ArrayList<>(Files.readAllLines(path));
            for (String s : stringList) {
                String[] line = s.split(" ");
                if (Objects.equals(line[1], nameProduct)) {
                    getInfoAboutCreate(getOrderPath(), s, getIndexerAndDataList());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void getInfoAboutCreate(Path path, String product, String indexerAndData) {
        File file = path.toFile();

        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {

            fileOutputStream.write(product.getBytes());
            fileOutputStream.write(" ".getBytes());
            fileOutputStream.write(indexerAndData.getBytes());

            fileOutputStream.write(System.lineSeparator().getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException es) {
            info("Try again");
        }

    }

    private String getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String getIndexerAndDataList() {
        return "Info order: (indexer: " + indexer + "; data create order: " + data + ")";

    }

    private void setIndexer() {
        int id = (int) (Math.random() * 89998 + 10001);
        this.indexer = String.valueOf(id);

    }

    private void setData() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        this.data = dateFormat.format(date);
    }

    private Path getOrderPath() {
        return Path.of("resourcesorder", "orderlist.txt");
    }

    private Path getProductPath() {
        return Path.of("resourcesproduct", "productlist.txt");
    }

    private void info(String info) {
        System.out.println(info);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(indexer, order.indexer) && Objects.equals(listProduct, order.listProduct) && Objects.equals(data, order.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexer, listProduct, data);
    }
}
