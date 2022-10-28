package HomeWork5;

import java.util.Random;

public class Matrix {
    public void setMatrix(){
        String[][] matrix = new String[10][10];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {


            }
        }
    }
    public double creatDouble() {
        Random random = new Random();
        double index = random.nextDouble(20 + 1);
//        index = index/1000000;
        index++;
        return index;
    }
    public String creatString() {
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

}
