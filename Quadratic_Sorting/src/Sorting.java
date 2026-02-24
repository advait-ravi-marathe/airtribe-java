import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    void isArrayValid(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Array must be non-empty");
        }
    }

    boolean isUnitaryArray(int[] arr) {
        return arr.length == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinMax minMaxUtil = new MinMax();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = null;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Take iteratively take input of numbers (Array)");
            System.out.println("2. Get maximum element of array");
            System.out.println("3. Get minimum element of an array");
            System.out.println("4. Sort array with bubble sort (ascending)");
            System.out.println("5. Sort array with bubble sort (ascending) and visualize");
            System.out.println("6. Sort array with bubble sort (descending)");
            System.out.println("7. Sort array with bubble sort (descending) and visualize");
            System.out.println("8. Sort array with insertion sort (ascending)");
            System.out.println("9. Sort array with insertion sort (ascending) and visualize");
            System.out.println("10. Sort array with insertion sort (descending)");
            System.out.println("11. Sort array with insertion sort (descending) and visualize");
            System.out.println("12. Sort array with selection sort (ascending)");
            System.out.println("13. Sort array with selection sort (ascending) and visualize");
            System.out.println("14. Sort array with selection sort (descending)");
            System.out.println("15. Sort array with selection sort (descending) and visualize");
            System.out.println("16. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    arr = new int[n];
                    System.out.println("Enter " + n + " numbers:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Array updated successfully.");
                    break;
                case 2:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] max = minMaxUtil.getMaxAndMaxIndex(arr);
                            System.out.println("Maximum element: " + max[0]);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 3:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int min[] = minMaxUtil.getMinAndMinIndex(arr);
                            System.out.println("Minimum element: " + min[0]);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 4:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = bubbleSort.bubbleSort(arr, true, false);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 5:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = bubbleSort.bubbleSort(arr, true, true);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 6:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = bubbleSort.bubbleSort(arr, false, false);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 7:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = bubbleSort.bubbleSort(arr, false, true);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 8:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = insertionSort.insertionSort(arr, true, false);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 9:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = insertionSort.insertionSort(arr, true, true);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 10:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = insertionSort.insertionSort(arr, false, false);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 11:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = insertionSort.insertionSort(arr, false, true);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 12:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = selectionSort.selectionSort(arr, true, false);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 13:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = selectionSort.selectionSort(arr, true, true);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 14:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = selectionSort.selectionSort(arr, false, false);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 15:
                    if (arr == null) {
                        System.out.println("Please input the array first (Option 1).");
                    } else {
                        try {
                            int[] sorted = selectionSort.selectionSort(arr, false, true);
                            System.out.println("Sorted Array Is - " + Arrays.toString(sorted));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                case 16:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class MinMax extends Sorting {

    /*
        Step 1: If arr.length = 0, throw an Exception.

        Step 2: If arr.length = 1, return arr[0].

        Step 3: Initialize max = arr[0]

        Step 4: Iterate from index = 1 to index < arr.length

        Step 5: If arr[index] > max, update max = arr[index]

        Step 6: Else skip update and make index = index + 1

        Step 7: Exit once index = arr.length and return max
     */

    int[] getMaxAndMaxIndex(int[] arr) throws Exception {

        isArrayValid(arr);

        if (arr.length == 1) {
            return new int[]{arr[0], 0};
        }

        int max = arr[0];

        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return new int[]{max, maxIndex};
    }

    /*
        Step 1: If arr.length = 0, throw an Exception.

        Step 2: If arr.length = 1, return arr[0].

        Step 3: Initialize min = arr[0]

        Step 4: Iterate from index = 1 to index < arr.length

        Step 5: If arr[index] < min, update min = arr[index]

        Step 6: Else skip update and make index = index + 1

        Step 7: Exit once index = arr.length and return min
     */

    int[] getMinAndMinIndex(int[] arr) throws Exception {

        isArrayValid(arr);

        if (arr.length == 1) {
            return new int[]{arr[0], 0};
        }

        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        return new int[]{min, minIndex};

    }
}

class BubbleSort extends Sorting {

    /*

        Bubble Sort Algorithm

        Take the maximum element and put it at right (or take minimum element and put it at left)

        Step 1: If arr.length = 0, throw an Exception (isArrayValid).

        Step 2: If arr.length = 1, return arr (isUnitaryArray).

        Step 3: Iterate from i = 0 to i < arr.length - 1.

        Step 4: Initialize swapped = false.

        Step 5: Iterate from j = 0 to j < arr.length - i - 1.

        Step 6: If isAscending and arr[j] > arr[j + 1], swap and set swapped = true.
                Else if !isAscending and arr[j] < arr[j + 1], swap and set swapped = true.

        Step 7: Once j loop ends, if swapped is false, break the i loop (array is sorted).

        Step 8: Return arr.

        Optimizations: Added early termination using 'swapped' flag if no swaps occur in a pass.

     */

    int[] bubbleSort(int[] arr, boolean isAscending, boolean visualize) throws Exception {

        isArrayValid(arr);

        if (isUnitaryArray(arr)) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                boolean condition = isAscending ? (arr[j] > arr[j + 1]) : (arr[j] < arr[j + 1]);

                if (condition) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }

                if (visualize) {
                    System.out.printf("Array after swap - %s\n", Arrays.toString(arr));
                }

            }

            if (visualize) {
                System.out.printf("Array after Pass %d is %s\n", i + 1, Arrays.toString(arr));
            }

            if (!swapped) {
                break;
            }
        }

        return arr;

    }
}

class InsertionSort extends Sorting {

    /*

        Insertion Sort Algorithm

        Keep shuffling elements in such a manner that right most (or left most) element is the smallest

        Step 1: If arr.length = 0, throw an Exception (isArrayValid).

        Step 2: If arr.length = 1, return arr (isUnitaryArray).

        Step 3: Iterate i from i = 1 to i < arr.length. (The first element is considered sorted)

        Step 4: Assign key = arr[i]

        Step 5: Iterate j from j = i - 1 to j = 0

        Step 6: While j >= 0 and:
                - (isAscending and arr[j] > key) OR
                - (!isAscending and arr[j] < key)
                Perform arr[j + 1] = arr[j] and j = j - 1

        Step 7: Assign arr[j + 1] = key

        Step 8: Once i = arr.length, return arr.

     */

    int[] insertionSort(int[] arr, boolean isAscending, boolean visualize) throws Exception {

        isArrayValid(arr);

        if (isUnitaryArray(arr)) {
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && (isAscending ? (arr[j] > key) : (arr[j] < key))) {
                arr[j + 1] = arr[j];
                j--;
                if (visualize) {
                    System.out.printf("Array after swap - %s\n", Arrays.toString(arr));
                }
            }

            arr[j + 1] = key;

            if (visualize) {
                System.out.printf("Array after Pass %d is %s\n", i, Arrays.toString(arr));
            }

        }

        return arr;
    }


}

class SelectionSort extends MinMax {

    /*

        Selection Sort Algorithm

        First, get the minimum element and swap it with the first element. Repeat the process for the remaining elements.

        Step 1: If arr.length = 0, throw an Exception (isArrayValid).

        Step 2: If arr.length = 1, return arr (isUnitaryArray).

        Step 3: Iterate from i = 0 to i < arr.length - 1.

        Step 4: Pass arr[i, n-1] as a parameter. Get the minimum element and its index from getMinAndMinIndex.
                For descending order, get the maximum element and its index from getMaxAndMaxIndex.

        Step 5: Swap the minimum (or maximum in case of descending order) element with arr[i + minIndex].

        Step 6: Repeat step 3 until i = arr.length - 1.

        Step 7: Return the sorted array.

     */

    int[] selectionSort(int[] arr, boolean isAscending, boolean visualize) throws Exception {

        isArrayValid(arr);

        if (isUnitaryArray(arr)) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int[] subArray = Arrays.copyOfRange(arr, i, arr.length);
            int[] elementAndElementIndex = isAscending ? getMinAndMinIndex(subArray) : getMaxAndMaxIndex(subArray);
            int tmp = arr[i];
            arr[i] = elementAndElementIndex[0]; //minAnsMinIndex[0] is the minimum element
            arr[i + elementAndElementIndex[1]] = tmp; //minAnsMinIndex[1] is the index of the minimum element

            if (visualize) {
                System.out.printf("Array after Pass %d is %s\n", i + 1, Arrays.toString(arr));
            }
        }

        return arr;
    }

}
