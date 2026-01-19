import java.util.Arrays;

public class ArrayUtility {
    void isArrayValid(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Array must be non-empty");
        }
    }

    boolean isUnitaryArray(int[] arr) {
        return arr.length == 1;
    }
}

class MinMax extends ArrayUtility {

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

class BubbleSort extends ArrayUtility {

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

            }

            if (visualize) {
                System.out.printf("Array after Swap %d is %s\n", i + 1, Arrays.toString(arr));
            }

            if (!swapped) {
                break;
            }
        }

        return arr;

    }
}

class InsertionSort extends ArrayUtility {

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
            }

            arr[j + 1] = key;

            if (visualize) {
                System.out.printf("Array after Pass %d is %s\n", i, Arrays.toString(arr));
            }

        }

        return arr;
    }


}
