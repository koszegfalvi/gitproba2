import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int tomb[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = random.nextInt(1, 100);

        }
    }

    public static void getMinFromArray(int tomb[]) {
        int min = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (min > tomb[i]) {
                min = tomb[i];
            }

        }
    }

    public static void countEvenNumbers(int tomb[]) {
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 == 0) {
                sum++;
            }
        }
    }

    public static void sumUnevenNumbers(int tomb[]) {
        int sum = 0;

        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 != 0) {
                sum += tomb[i];
            }

        }
    }

    public static void getMaxFromArray(int tomb[]) {
        int max = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (max < tomb[i]) {
                max = tomb[i];
            }

        }
    }

    public static void countUnevenNumbers(int tomb[]) {
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 != 0) {
                sum++;
            }
        }
    }

    public static void sumEvenNumbers(int tomb[]) {
        int sum = 0;

        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 == 0) {
                sum += tomb[i];
            }

        }
    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findOddNumbers(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

}






