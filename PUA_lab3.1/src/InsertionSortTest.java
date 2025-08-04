import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class InsertionSortTest {

    @Test
    @Timeout(1)
    public void testSortEmptyArray() {
        int[] arr = {};
        InsertionSort sorter = new InsertionSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{}, sortedArr);
    }

    @Test
    public void testSortSingleElementArray() {
        int[] arr = {5};
        InsertionSort sorter = new InsertionSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{5}, sortedArr);
    }

    @Test
    public void testSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        InsertionSort sorter = new InsertionSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    public void testSortReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        InsertionSort sorter = new InsertionSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    public void testSortRandomArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        InsertionSort sorter = new InsertionSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, sortedArr);
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        MergeSort sorter = new MergeSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{}, sortedArr);
    }

    @Test
    public void testMergeSortSingleElementArray() {
        int[] arr = {5};
        MergeSort sorter = new MergeSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{5}, sortedArr);
    }

    @Test
    public void testMergeSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        MergeSort sorter = new MergeSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    public void testHeapSortEmptyArray() {
        int[] arr = {};
        HeapSort sorter = new HeapSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{}, sortedArr);
    }

    @Test
    public void testHeapSortSingleElementArray() {
        int[] arr = {5};
        HeapSort sorter = new HeapSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{5}, sortedArr);
    }

    @Test
    public void testHeapSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        HeapSort sorter = new HeapSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    public void testQuickSortEmptyArray() {
        int[] arr = {};
        QuickSort sorter = new QuickSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{}, sortedArr);
    }

    @Test
    public void testQuickSortSingleElementArray() {
        int[] arr = {5};
        QuickSort sorter = new QuickSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{5}, sortedArr);
    }

    @Test
    public void testQuickSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        QuickSort sorter = new QuickSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    public void testBubbleSortEmptyArray() {
        int[] arr = {};
        BubbleSort sorter = new BubbleSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{}, sortedArr);
    }

    @Test
    public void testBubbleSortSingleElementArray() {
        int[] arr = {5};
        BubbleSort sorter = new BubbleSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{5}, sortedArr);
    }

    @Test
    public void testBubbleSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort sorter = new BubbleSort();
        int[] sortedArr = sorter.sort(arr, arr.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

}

