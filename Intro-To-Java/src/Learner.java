public class Learner {
    String firstName;
    String lastName;
    int cohort;
    Course[] courses;

    public Learner(String firstName, String lastName, int cohort, Course[] courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cohort = cohort;
        this.courses = courses;
    }

    public void displayDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Cohort: " + cohort);
        System.out.println("Courses:");
        if (courses != null) {
            for (Course course : courses) {
                System.out.println(" - Course: " + course.name + ", Cumulative Grade: " + course.cumulativeGrade);
            }
        }
        System.out.println("---------------------------");
    }
}
