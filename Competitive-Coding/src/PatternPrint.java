import java.util.Scanner;

public class PatternPrint {
    void RightAlignedNumberTriangle(int base) {
        for (int i = 1; i <= base; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    void RightAlignedInvertedStarTriangle(int base) {
        for (int i = base; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void LeftAlignedStarTriangle(int base) {
        for (int i = base - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int k = 1; k <= base - i; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    void Square(int side) {
        for (int i = 1; i <= side; i++) {
            if (i == 1 || i == side) {
                for (int j = 1; j <= side; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 2; j <= side - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void RightAlignedCharacterTriangle(int base) {
        for (int i = 0; i < base; i++) {
            for (char j = 'A'; j <= i + 'A'; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void RightAlignedNumberTriangleV2(int base) {
        int count = 1;
        for (int i = 0; i < base; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatternPrint patternPrint = new PatternPrint();

        while (true) {
            System.out.println("\n--------- PATTERN PRINT MENU ----------");
            System.out.println("1. Right aligned number triangle with base 5");
            System.out.println("2. Right aligned inverted star triangle with base 5");
            System.out.println("3. Left aligned star triangle with base 5");
            System.out.println("4. Square with side 5");
            System.out.println("5. Right aligned character triangle with base 5");
            System.out.println("6. Right aligned number triangle (V2) with base 5");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    patternPrint.RightAlignedNumberTriangle(5);
                    break;
                }
                case 2: {
                    patternPrint.RightAlignedInvertedStarTriangle(5);
                    break;
                }
                case 3: {
                    patternPrint.LeftAlignedStarTriangle(5);
                    break;
                }
                case 4: {
                    patternPrint.Square(5);
                    break;
                }
                case 5: {
                    patternPrint.RightAlignedCharacterTriangle(5);
                    break;
                }
                case 6: {
                    patternPrint.RightAlignedNumberTriangleV2(5);
                    break;
                }
                case 7: {
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
