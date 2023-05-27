import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();

    }

    public static void task0() {
        System.out.println("Task 0,lecture notes");
    }

    public static void task1() {
        System.out.println("\nTask 1");
        int[] array = {1, 2, 3, 4, 56, 0};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void task2() {
        System.out.println("\nTask 2");
    }

    public static void task3() {
        System.out.println("\nTask 3");
    }

    public static void task4() {
        System.out.println("\nTask 4");
        int minIndex = 0;
        int[] array = {1, 2, 3, 4, 56, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        System.out.println(minIndex);
    }

    public static void task5() {
        System.out.println("\nTask 5");
    }

    public static void task6() {
        System.out.println("\nTask 6");
    }

    public static void task7() {
        System.out.println("\nTask 7");
    }

    public static void task8() {
        System.out.println("\nTask 8");
    }

    public static void task9() {
        System.out.println("\nTask 9");
        Random random = new Random();
        int[] array9 = new int[10];
        for (int i = 0; i < array9.length; i++) {
            array9[i] = random.nextInt(200) - 100;
        }

        for (int k = 0; k < array9.length - 1; k++) {
            for (int i = 0; i < array9.length - 1 - k; i++) {
                if (array9[i] > array9[i + 1]) {
                    int temp = array9[i];
                    array9[i] = array9[i + 1];
                    array9[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array9));

    }

    public static void task10() {
        System.out.println("\nTask 10");
        Random random = new Random();
        int[] insertSort = new int[100];
        for (int i = 0; i < insertSort.length; i++) {
            insertSort[i] = random.nextInt(200) - 100;
        }
        for (int k = 0; k < insertSort.length; k++) {
            for (int i = k; i > 0; i--) {
                if (insertSort[i] < insertSort[i - 1]) {
                    int temp = insertSort[i];
                    insertSort[i] = insertSort[i - 1];
                    insertSort[i - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(insertSort));
    }

    public static void task11() {
        System.out.println("\nTask 11");
        Random random = new Random();
        int[] mergeSort = new int[99];
        for (int i = 0; i < mergeSort.length; i++) {
            mergeSort[i] = random.nextInt(200) - 100;
        }
        sortByMerge(mergeSort, 0, mergeSort.length - 1);
        System.out.println(Arrays.toString(mergeSort));
    }

    public static void sortByMerge(int[] mergeSort, int indexStart, int indexEnd) {
        if (indexEnd - indexStart >= 1) {
            int middle = (indexStart + indexEnd)/2;
            sortByMerge(mergeSort, indexStart, middle);
            sortByMerge(mergeSort, middle + 1, indexEnd);

            int[] resultingArray = new int[indexEnd - indexStart + 1];
            int leftIndex = indexStart;
            int rightIndex = middle + 1;

            for (int i = indexStart; i <= indexEnd; i++) {
                if (leftIndex > middle || (rightIndex <= indexEnd && mergeSort[leftIndex] > mergeSort[rightIndex])) {
                    resultingArray[i - indexStart] = mergeSort[rightIndex];
                    rightIndex++;
                } else {
                    resultingArray[i - indexStart] = mergeSort[leftIndex];
                    leftIndex++;
                }
            }
            for (int i = indexStart; i <= indexEnd; i++) {
                mergeSort[i] = resultingArray[i - indexStart];
            }
        }
    }
}