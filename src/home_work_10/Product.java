package home_work_10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Product {

    private String indexer;
    private String nameProduct;
    private String dataCreate;

    public void createNewProduct() {

        setVariables();

        File file = getPath().toFile();

        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {


            writerFile(fileOutputStream, getValidIndexer());

            writerFile(fileOutputStream, getNameProduct());

            writerFile(fileOutputStream, getValidData());

            fileOutputStream.write(System.lineSeparator().getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException es) {
            System.out.println("Try again");
        }
    }


    public void showProductList() {

        Path path = getPath();
        try {
            List<String> stringList = new ArrayList<>(Files.readAllLines(path));
            for (String s : stringList) {
                String[] line = s.split(" ");
                System.out.println(line[1]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct() {

        info("If you want delete product write his indexer: ");

        String id = getScanner();

        try {
            delete(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void delete(String id) throws IOException {
        List<String> list = Files.lines(Path.of("resourcesproduct", "productlist.txt"))
                .filter(string -> !string.contains(id))
                .toList();
        Files.write(getPath(), list);
    }

    public void cleanerList() {
        try {
            List<String> list = Files.lines(Path.of("resourcesproduct", "productlist.txt"))
                    .filter(string -> string.length() > 17)
                    .toList();
            Files.write(getPath(), list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getValidData() {
        String data = getDataCreate();
        Pattern pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((18|19|20|21)\\d\\d)");
        Matcher matcher = pattern.matcher(data);
        try {
            if (matcher.find()) {
                return data;
            } else {
                throw new UnValidDataException("Unvalid Data");
            }
        } catch (UnValidDataException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    private String getValidIndexer() {
        String value = getIndexer();
        try {
            if (value.length() != 5) {
                value = null;
                throw new UnValidIndexerException("Unvalid indexer");
            }
        } catch (UnValidIndexerException e) {
            System.err.println(e.getMessage());
        }
        return value;
    }


    private void setVariables() {

        info("get indexer for example : 11111");
        setIndexer();

        info("get name:");
        setNameProduct();

        info("get data for example : DD-MM-YYYY ");
        setDataCreate();

    }

    private void writerFile(FileOutputStream fileOutputStream, String line) throws IOException {
        fileOutputStream.write(line.getBytes());
        fileOutputStream.write(' ');

    }

    private void info(String info) {
        System.out.println(info);
    }

    private String getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private Path getPath() {
        return Path.of("resourcesproduct", "productlist.txt");
    }

    private String getIndexer() {
        return indexer;
    }

    private void setIndexer() {
        this.indexer = getScanner();
    }

    private String getNameProduct() {
        return nameProduct;
    }

    private void setNameProduct() {
        this.nameProduct = getScanner();
    }

    private String getDataCreate() {
        return dataCreate;
    }

    private void setDataCreate() {
        this.dataCreate = getScanner();
    }
}
