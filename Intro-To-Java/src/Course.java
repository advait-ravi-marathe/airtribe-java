public class Course {
    String name;
    Assignment[] assignments;
    float cumulativeGrade;

    public Course(String name, Assignment[] assignments) {
        this.name = name;
        this.assignments = assignments;
        this.cumulativeGrade = calculateCumulativeGrade();
    }

    private float calculateCumulativeGrade() {
        if (assignments == null || assignments.length == 0) {
            return 0;
        }
        int totalMarks = 0;
        for (Assignment assignment : assignments) {
            totalMarks += assignment.marksObtained;
        }
        return (float) totalMarks / assignments.length;
    }
}
