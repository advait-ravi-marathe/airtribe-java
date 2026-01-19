import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinMax minMaxUtil = new MinMax();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = null;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Take iteratively take input of numbers (Array)");
            System.out.println("2. Get maximum element of array");
            System.out.println("3. Get minimum element of an array");
            System.out.println("4. Sort algorithm with bubble sort (ascending)");
            System.out.println("5. Sort algorithm with bubble sort (ascending) and visualize");
            System.out.println("6. Sort algorithm with bubble sort (descending)");
            System.out.println("7. Sort algorithm with bubble sort (descending) and visualize");
            System.out.println("8. Sort algorithm with insertion sort (ascending)");
            System.out.println("9. Sort algorithm with insertion sort (ascending) and visualize");
            System.out.println("10. Sort algorithm with insertion sort (descending)");
            System.out.println("11. Sort algorithm with insertion sort (descending) and visualize");
            System.out.println("12. Exit");
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
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}