public class GradeBookTest {
    public static void main(String[] args) {
        int [] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook gradeBook = new GradeBook(
                "CS101 Introduction to Java programming", gradesArray);
        System.out.printf("Welcome to grade book for%n%s%n%n",
                gradeBook.getCourseName());
        gradeBook.processGrade();
    }
}
