import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5, 5);
        printColor(200);
        compareNumbers(5,4);
        System.out.println(checkSumWithin(10,15));
        printCheckInt(0);
        System.out.println(checkInt(0));
        printCopyString("Hello", 3);
        System.out.println(checkLeapYear(2025));
        invertArray();
        createArrayHundred();
        updateArray();
        createTwoDimensionalArr(4);
        System.out.println(Arrays.toString(createArr(4,10)));
    }
    //1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //2
    public static void checkSumSign(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //3
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //4
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //5
    public static boolean checkSumWithin(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    //6
    public static void printCheckInt(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    //7
    public static boolean checkInt(int a) {
        return a >= 0;
    }
    //8
    public static void printCopyString(String str, int c) {
        while (c > 0){
            System.out.println(str);
            c--;
        }
    }
    //9
    public static boolean checkLeapYear(int year){
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
    //10
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //11
    public static void createArrayHundred(){
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++){
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    //12
    public static void updateArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //13
    public static void createTwoDimensionalArr (int n){
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            arr[i][i] = 1;
            arr[i][n - i - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //14
    public static int[] createArr(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}