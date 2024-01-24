import java.time.*;

public class Sorter {
    enum Algorithm {
        BUBBLE_SORT,
        SLOW_INSERTION_SORT,
        INSERTION_SORT
    }

    final public static int LIST_LENGTH = 10000;

    public static void main(String[] args) {
        sort(Algorithm.INSERTION_SORT);
        sort(Algorithm.SLOW_INSERTION_SORT);
        sort(Algorithm.BUBBLE_SORT);
    }

    public static void sort(Algorithm algorithm) {
        int[] list = generateUnsortedArray(LIST_LENGTH);

        LocalDateTime startTime = LocalDateTime.now();

        switch (algorithm) {
            case BUBBLE_SORT:
                // implement me!
            case SLOW_INSERTION_SORT:
                // implement me!
            case INSERTION_SORT:
                // implement me!
        }

        if (!isSorted(list)) {
            System.out.printf("%n%s failed to sort the list! %n", algorithm.name());
            return;
        }

        LocalDateTime endTime = LocalDateTime.now();
        Duration runtime = Duration.between(startTime, endTime);
        System.out.printf("%n%s took %d milliseconds %n", algorithm.name(), runtime.toMillis());
    }

    public static int[] generateUnsortedArray(int length) {
        // implement me!
    }

    public static void slowInsertionSort(int[] list) {
        // implement me!
    }

    public static void insertionSort(int[] list) {
        // implement me!
    }

    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i- 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
