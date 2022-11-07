package HomeWork5;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {


    public String createdString() {
        char[] array = new char[7];
        int name;
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            name = random.nextInt(25) + 'a';
            array[i] = (char) name;
        }
        String string = new String(array);
        return string;
    }

    public String toDouble() {
        Random random = new Random();
        Double index = random.nextDouble((3 + 1));
        String doubl = index.toString();
        String validseven = doubl.substring(0, 7);
        return validseven;
    }

    public String getMatrix() {
        String[][] matrix = new String[10][10];
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        int eachthree = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                eachthree++;
                if (eachthree % 3 == 0) {
                    matrix[i][j] = toDouble();
                } else {
                    matrix[i][j] = createdString();
                }
                System.out.print(matrix[i][j] + " ");
                if (i == j) {
                    builder.append(matrix[i][j] + " ");
                } else if (j == matrix.length - (i + 1)) {
                    builder2.append(matrix[i][matrix.length - (i + 1)] + " ");
                }
            }
            System.out.println();
        }
        String maindiagonal = builder.toString();
        String[] arraymain = maindiagonal.split(" ");
        String shelfdioganal = builder2.toString();
        String[] arrayshelf = shelfdioganal.split(" ");
        String doubledioganal = maindiagonal + shelfdioganal;
        System.out.println("If the diagonals are equal you get the answer (true), if not equal you get answer (false): " + builder.equals(builder2));
        return doubledioganal;
    }

    public void toSplit() {
        String generalmatrix = getMatrix();
        int[] array = new int[6];
        StringBuilder builder = new StringBuilder();
        Pattern patterndouble = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Pattern patternstring = Pattern.compile("[a-z]+\s");
        Matcher matcherdoble = patterndouble.matcher(generalmatrix);
        Matcher matcherstring = patternstring.matcher(generalmatrix);
        for (int i = 0; i < generalmatrix.length(); i++) {
            if (matcherdoble.find()) {
                double value = Double.parseDouble(matcherdoble.group());
                if (value >= 1.7) {
                    int value2 = (int) Math.round(value);
                    array[i] = value2;
                    System.out.print(array[i] + "_");
                } else {
                    int value2 = (int) Math.floor(value);
                    array[i] = value2;
                    System.out.print(array[i] + "_");
                }
            } else if (matcherstring.find()) {
                String string = matcherstring.group();
                builder.append(string.substring(2, 5) + ", ");
            } else if (i == generalmatrix.length() - 1) {
                System.out.println();
            }
        }
        System.out.print(builder);
    }

}
