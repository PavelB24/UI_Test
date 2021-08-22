import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Logger logger = Logger.getLogger("MainLog");
//        Handler handler = new FileHandler("src/main/resources/mylog.log");
//        logger.addHandler(handler);
//        logger.setLevel(Level.ALL);
//        logger.getHandlers()[0].setLevel(Level.ALL);
//        logger.getHandlers()[0].setFormatter(new SimpleFormatter());
//        System.out.println("Флоппа");
//
//        logger.log(Level.SEVERE, "Logger S");
//        logger.log(Level.CONFIG, "Logger К");
//        logger.log(Level.WARNING, "Logger В");
//        logger.log(Level.INFO, "Logger I");
        // Задание 1
        int[] arr1 = {1, 0, 1, 0, 0, 1, 0, 1};
        toChangeNumbers(arr1);
        // Задание 2
        System.out.println();
        int[] arr2 = new int[8];
        toFillArray(arr2);
        //Задание 2 вариант 2
        System.out.println();
        int[] arr21 = new int[8];
        toFillArray2(arr21);
        //Задание 3
        System.out.println();
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        toChangeSomeNumbers(arr3);
        //Задание 4
        System.out.println();
        int[][] arr4 = new int[10][10];
        toFillTheField(arr4);
        //Задание 5 способ 1 Тимофей, я так понимаю потоки будут изучаться ближе к концу? :)
        int[] arr5 = {16, 50, 64, 82};
        System.out.println("Максимальный эл-т массива: " + Arrays.stream(arr5).max());
        System.out.println("Минимальный эл-т массива: " + Arrays.stream(arr5).min());
        // Задание 5 способ 2
        int[] arr6 = {16, 50, 64, 82};
        toFindMaxandMin(arr6);

        // Задание 5 способ 3
        int[] minMax = {56, 58, 44, 81, 47, 12, 36, 54, 91, 10, 16, 17, 22};
        toFindMin2(minMax);
        toFindMax2(minMax);
        // Задание 5 способ 3
        Arrays.sort(minMax);
        System.out.println("Минимальный эллемент массива: " + minMax[0]);
        System.out.println("Максимальный эллемент массива: " + minMax[12]);
        //Задание 6
        int[] arr7 = {1, 3, 0, 4};
        System.out.println(isEqual(arr7));
        // Задание 7, сдвиг влево
        int[] arr8 = {1, 4, 8, 6, 5, 6, 8};
        int z = 1;
        toMoveLeft(arr8, z);
        // Задание 7, сдвиг вправо
        System.out.println();
        int[] arr9 = {1, 4, 8, 6, 5, 89, 4};
        toMoveRight(arr9, z);
    }

    public static Integer toFindMax2(int[] minMax) {
        int maxValue = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            if (minMax[i] > maxValue) {
                maxValue = minMax[i];
            }
        } return  maxValue;
    }
    public static Integer toFindMin2(int[] minMax) {
        int minValue = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            if (minMax[i] < minValue) {
                minValue = minMax[i];
            }
        }
        return minValue;
    }

    public static void toFindMaxandMin(int[] arr6) {
        if (arr6[0] > arr6[1] && arr6[0] > arr6[2] && arr6[0] > arr6[3]) {
            System.out.println("Самое большое число массива arr6: " + arr6[0]);
        } else if (arr6[1] > arr6[0] && arr6[1] > arr6[2] && arr6[1] > arr6[3]) {
            System.out.println("Самое большое число массива arr6: " + arr6[1]);
        } else if (arr6[2] > arr6[0] && arr6[2] > arr6[1] && arr6[2] > arr6[3]) {
            System.out.println("Самое большое число массива arr6: " + arr6[2]);
        } else if (arr6[3] > arr6[0] && arr6[3] > arr6[1] && arr6[3] > arr6[2]) {
            System.out.println("Самое большое число массива arr6: " + arr6[3]);
        }
        if (arr6[0] < arr6[1] && arr6[0] < arr6[2] && arr6[0] < arr6[3]) {
            System.out.println("Самое маленькое число массива arr6: " + arr6[0]);
        } else if (arr6[1] < arr6[0] && arr6[1] < arr6[2] && arr6[1] < arr6[3]) {
            System.out.println("Самое маленькое число массива arr6: " + arr6[1]);
        } else if (arr6[2] < arr6[0] && arr6[2] < arr6[1] && arr6[2] < arr6[3]) {
            System.out.println("Самое маленькое число массива arr6: " + arr6[2]);
        } else if (arr6[3] < arr6[0] && arr6[3] < arr6[1] && arr6[3] < arr6[2]) {
            System.out.println("Самое маленькое число массива arr6: " + arr6[3]);
        }
    }

    public static void toFillTheField(int[][] arr) {
        int lastIndex=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i]=1;
            arr[i][lastIndex-i]=1;
        }
        for (int[] elements: arr){
            System.out.println(Arrays.toString(elements));
        }}


    public static void toChangeSomeNumbers(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(" " + arr3[i]);
        }
    }

    public static void toFillArray2(int[] arr21) {
        for (int g = 0; g < arr21.length; g++) {
            switch (g) {
                case 0:
                    arr21[g] = 0;
                    break;
                case 1:
                    arr21[g] = 3;
                    break;
                case 2:
                    arr21[g] = 6;
                    break;
                case 3:
                    arr21[g] = 9;
                    break;
                case 4:
                    arr21[g] = 12;
                    break;
                case 5:
                    arr21[g] = 15;
                    break;
                case 6:
                    arr21[g] = 18;
                    break;
                case 7:
                    arr21[g] = 21;
                    break;
            }
            System.out.print(" " + arr21[g]);
        }
    }

    public static void toFillArray(int[] arr2) {
        int y = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + y;
            y += 3;
            System.out.print(" " + arr2[i]);
        }
    }

    private static void toChangeNumbers(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = arr1[i] - 1;
            } else if (arr1[i] == 0) {
                arr1[i] = arr1[i] + 1;
            }
            System.out.print(" " + arr1[i]);
        }
    }

    static void toMoveLeft(int[] arr8, int z) {
        int y = arr8[0];
        for (int i = 0; i < arr8.length - 1; i++) {
            arr8[i] = arr8[i + z];
            System.out.print(arr8[i] + " ");
        }
        arr8[arr8.length - 1] = y;
        System.out.print(arr8[arr8.length - 1] + " ");
    }


    static boolean isEqual(int[] arr) {
        int leftPart = 0;
        int rightPart = sumOfArray(arr);
        for (int i = 0; i < arr.length; i++) {
            leftPart += arr[i] + i;
            rightPart -= arr[i] - i;
            if (leftPart == rightPart) {
                return true;
            }

        }
        return false;
    }

    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void toMoveRight(int[] arr9, int z) {
        int y = arr9[arr9.length - 1];
        for (int i = arr9.length - 1; i >= 1; i--) {
            arr9[i] = arr9[i - z];
        }
        arr9[0] = y;
        for (Integer d : arr9)
            System.out.print(d + " ");

    }
}


