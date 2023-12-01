import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        System.out.println("Positive Test - Original: " + arrayToString(arr));

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        System.out.println("Positive Test - Sorted: " + arrayToString(arr));
        int[] Sortedarr = {2, 7, 8, 9, 10};
        assertArrayEquals(Sortedarr, arr);
    }

    public void testNegative() {
        int[] arr = {-3, -1, -4, -2, -5};
        System.out.println("Negative Test - Original: " + arrayToString(arr));

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        System.out.println("Negative Test - Sorted: " + arrayToString(arr));
        int[] Sortedarr = {-5, -4, -3, -2, -1};
        assertArrayEquals(Sortedarr, arr);
    }

    public void testMixed() {
        int[] arr = {3, -2, 0, 1, -1};
        System.out.println("Mixed Test - Original: " + arrayToString(arr));

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        System.out.println("Mixed Test - Sorted: " + arrayToString(arr));
        int[] Sortedarr = {-2, -1, 0, 1, 3};
        assertArrayEquals(Sortedarr, arr);
    }

    public void testDuplicates() {
        int[] arr = {2, 3, 2, 1, 3};
        System.out.println("Duplicates Test - Original: " + arrayToString(arr));

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        System.out.println("Duplicates Test - Sorted: " + arrayToString(arr));
        int[] Sortedarr = {1, 2, 2, 3, 3};
        assertArrayEquals(Sortedarr, arr);
    }

    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

