import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Learner> learners = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Learner Management System ---");
            System.out.println("1. Create a new learner");
            System.out.println("2. Get a particular learner details through first name");
            System.out.println("3. Get all learners within particular cohort");
            System.out.println("4. Get all registered learners");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createLearner();
                    break;
                case 2:
                    getLearnerByFirstName();
                    break;
                case 3:
                    getLearnersByCohort();
                    break;
                case 4:
                    getAllLearners();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createLearner() {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Cohort (Number): ");
        int cohort = scanner.nextInt();
        scanner.nextLine(); // consume newline

        ArrayList<Course> coursesList = new ArrayList<>();
        boolean addMoreCourses = true;
        while (addMoreCourses) {
            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine();

            ArrayList<Assignment> assignmentsList = new ArrayList<>();
            boolean addMoreAssignments = true;
            while (addMoreAssignments) {
                System.out.print("Enter Assignment Name: ");
                String assignmentName = scanner.nextLine();
                System.out.print("Enter Marks Obtained: ");
                int marks = scanner.nextInt();
                scanner.nextLine(); // consume newline

                assignmentsList.add(new Assignment(assignmentName, marks));

                System.out.print("Add another assignment? (Y/y for yes): ");
                String choice = scanner.nextLine();
                if (!choice.equalsIgnoreCase("Y")) {
                    addMoreAssignments = false;
                }
            }

            coursesList.add(new Course(courseName, assignmentsList.toArray(new Assignment[0])));

            System.out.print("Add another course? (Y/y for yes): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                addMoreCourses = false;
            }
        }

        Learner learner = new Learner(firstName, lastName, cohort, coursesList.toArray(new Course[0]));
        learners.add(learner);
        System.out.println("Learner created successfully!");
    }

    private static void getLearnerByFirstName() {
        System.out.print("Enter First Name to search: ");
        String firstName = scanner.nextLine();
        boolean found = false;
        for (Learner learner : learners) {
            if (learner.firstName.equalsIgnoreCase(firstName)) {
                learner.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No learner found with first name: " + firstName);
        }
    }

    private static void getLearnersByCohort() {
        System.out.print("Enter Cohort Number to search: ");
        int cohort = scanner.nextInt();
        scanner.nextLine(); // consume newline
        boolean found = false;
        for (Learner learner : learners) {
            if (learner.cohort == cohort) {
                learner.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No learners found in cohort: " + cohort);
        }
    }

    private static void getAllLearners() {
        if (learners.isEmpty()) {
            System.out.println("No learners registered.");
            return;
        }
        for (Learner learner : learners) {
            learner.displayDetails();
        }
    }
}