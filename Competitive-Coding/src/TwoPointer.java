import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {
    /*
        Two pointer technique is a common algorithmic pattern used to solve problems
        involving arrays or linked lists. It involves using two pointers that move
        towards each other or in opposite directions to find a solution.
     */
    void TargetSumPair() {
        /*
            Here is an example of two pointer technique
            The problem statement is to find two numbers in an array that add up to a given target.
         */
        int[] arr = {2, 4, 6, 7, 10};
        int target = 11;

        /*
            Here is the brute force approach:
            We will iterate through each element in the array and check if there is another element that adds up to
            the target. For this approach, the time complexity is O(n^2).
         */

        System.out.println("Array - " + Arrays.toString(arr));
        System.out.println("Target - " + target);
        System.out.println("**** BRUTE FORCE APPROACH ****");
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The two numbers are that sum up to target are - " + arr[i] + " and " + arr[j]);
                }
                count++;
            }
        }
        System.out.println("Total number of steps taken - " + count);

        /*
            Here is the optimized approach (only works if an array is sorted):
            We will use two pointers to iterate through the array. The first pointer (i) will start from the beginning,
            and the second pointer (j) will start from the end. Check for these conditions
            1. arr[i] + arr[j] < target: Increment i
            2. arr[i] + arr[j] > target: Decrement j
            3. arr[i] + arr[j] == target: Print the two numbers
            The time complexity of this approach is O(n).
         */

        System.out.println("\n**** OPTIMIZED APPROACH ****");
        for (int i = 0, j = arr.length - 1; i < j; ) {
            if (arr[i] + arr[j] == target) {
                System.out.println("The two numbers are that sum up to target are - " + arr[i] + " and " + arr[j]);
            }
            if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
            count++;
        }
        System.out.println("Total number of steps taken - " + count);

    }

    void RemoveDuplicates(boolean visualize) {
        /*
            We need to remove duplicates from an array without using any extra space.
         */

        int[] arr = {1, 1, 2, 2, 3, 5, 5, 5, 8};
        System.out.println("Array - " + Arrays.toString(arr));

        /*
            Here is the brute force approach:
            We will iterate through the array using i. Inside the loop, we will iterate through the array again using j.
            If arr[i] == arr[j], we will set arr[j] to 0, and increment j variable.
            The time complexity of this approach is O(n^2).
         */

        System.out.println("**** BRUTE FORCE APPROACH ****");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
                count++;
            }
        }
        System.out.println("Array after removing duplicates - " + Arrays.toString(arr));
        System.out.println("Total number of steps taken - " + count);

        /*
            Here is the optimized approach:
            We will use two pointers to iterate through the array. The first pointer (fast) is a fast pointer,
            and the second pointer (slow) is a slow pointer. Check for these conditions
            1. If arr[fast] != arr[slow], increment slow.
            2. Assign arr[slow] = arr[fast]
            3. In this manner, we will shift duplicates to the right.
            The time complexity of this approach is O(n).
         */
        System.out.println("\n**** OPTIMIZED APPROACH ****");
        int slow = 0;
        count = 0;
        arr = new int[]{1, 1, 2, 2, 3, 5, 5, 5, 8};

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
                if (visualize) {
                    System.out.printf("Assigned arr[%d] to arr[%d] \n", slow, fast);
                    System.out.println("Slow pointer incremented");
                    System.out.println("Fast pointer is at " + fast + " and slow pointer is at " + slow);
                }
            } else {
                System.out.println("Fast pointer is at " + fast + " and slow pointer is at " + slow);
            }
            System.out.println("Array at step " + (count + 1) + " - " + Arrays.toString(arr) + "\n");
            count++;
        }
        System.out.println("Array after removing duplicates - " + Arrays.toString(Arrays.copyOf(arr, slow + 1)));
        System.out.println("Total number of steps taken - " + count);
    }

    boolean IsPalindrome(String str) {
        /*
            To check whether a given string is a palindrome or not.
            We will iterate through the string from both ends and compare the characters.
            If the characters at both ends are not equal, we will return false.
            If we reach the middle of the string, we will return true.
         */
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    void Palindrome() {
        String test_1 = "racecar";
        String test_2 = "hello";
        System.out.printf("%s is %s", test_1, IsPalindrome(test_1) ? "a palindrome" : "not a palindrome");
        System.out.println();
        System.out.printf("%s is %s", test_2, IsPalindrome(test_2) ? "a palindrome" : "not a palindrome");
    }

    void ShiftZeroes(boolean visualize) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("Array before shifting - " + Arrays.toString(arr));

        /*
            We will initiate two pointers, fast = 0 and slow = 0. Look for these conditions -
            1. If arr[fast] == 0, we will increment fast.
            2. If arr[fast] != 0, we will assign arr[slow] as arr[fast] and arr[fast] as 0. Increment slow.
            3. In this manner we will shift all zeroes to the end.
         */

        for (int slow = 0, fast = 0, count = 0; fast < arr.length; fast++, count++) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                arr[fast] = 0;
                slow++;
            }
            if (visualize) {
                System.out.printf("Array after pass %d is - %s\n", count + 1, Arrays.toString(arr));
            }
        }

        System.out.println("Array after shifting - " + Arrays.toString(arr));
    }

    boolean IsVowel(char key) {
        return switch (key) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    void SwapVowels() {
        String test = "education";
        char[] arr = test.toCharArray();
        System.out.println("Before swapping vowels - " + test);

        /*
            Initialize two pointers start = 0 and end = 0. Check these conditions -
            1. If arr[start] and arr[end] both are vowels, swap.
            2. If arr[start] is not a vowel, increment start.
            3. If arr[end] is not a vowel, increment end.
         */

        for (int start = 0, end = arr.length - 1; start < end; ) {
            if (IsVowel(arr[start]) && IsVowel(arr[end])) {
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
            if (!IsVowel(arr[start]))
                start++;
            if (!IsVowel(arr[end]))
                end--;
        }

        System.out.println("After swapping vowels - " + new String(arr));
    }

    void ThreeSum() {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        /*
            First, we will sort the array.
            Initialize i = 0, start = i + 1 and end = arr.length - 1.
            Initialize sum = arr[i].
            If sum + arr[end] + arr[start] < target, increment start.
            If sum + arr[start] + arr[end] > target, decrement end.
            If sum + arr[start] + arr[end] = target, print pair.
         */

        try {
            int[] sorted = new SelectionSort().selectionSort(arr, true, false);

            for (int i = 0; i < sorted.length - 2; i++) {
                // Skip duplicates for i
                if (i > 0 && arr[i] == arr[i - 1]) continue;

                int start = i + 1;
                int end = sorted.length - 1;

                while (start < end) {
                    int sum = arr[i] + arr[start] + arr[end];

                    if (sum == target) {
                        System.out.printf("The triplet that sums to %d is  - [%d, %d, %d]. \n", target, sorted[i], sorted[start], sorted[end]);
                        start++;
                        end--;

                        // Skip duplicates for start & end
                        while (start < end && arr[start] == arr[start - 1]) start++;
                        while (start < end && arr[end] == arr[end + 1]) end--;
                    } else if (sum < 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoPointer twoPointer = new TwoPointer();

        while (true) {
            System.out.println("\n--------- TWO POINTER MENU ----------");
            System.out.println("1. Two Pointers - Target Sum Pair from sorted array");
            System.out.println("2. Two Pointers - Remove duplicates from sorted array");
            System.out.println("3. Two Pointers - Remove duplicates from sorted array and visualize");
            System.out.println("4. Two Pointers - To check whether a string is a palindrome or not");
            System.out.println("5. Two Pointers - Shift zeroes in the end");
            System.out.println("6. Two Pointers - Shift zeroes in the end and visualize");
            System.out.println("7. Two Pointers - Swap vowels in a string");
            System.out.println("8. Two Pointers - Triplet Sum");
            System.out.println("9. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    twoPointer.TargetSumPair();
                    break;
                }
                case 2: {
                    twoPointer.RemoveDuplicates(false);
                    break;
                }
                case 3: {
                    twoPointer.RemoveDuplicates(true);
                    break;
                }
                case 4: {
                    twoPointer.Palindrome();
                    break;
                }
                case 5: {
                    twoPointer.ShiftZeroes(false);
                    break;
                }
                case 6: {
                    twoPointer.ShiftZeroes(true);
                    break;
                }
                case 7: {
                    twoPointer.SwapVowels();
                    break;
                }
                case 8: {
                    twoPointer.ThreeSum();
                    break;
                }
                case 9: {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
