public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001,"Lee");
        studentLee.addSubject("국어",80);
        studentLee.addSubject("수학", 100);

        Student studentkim = new Student(1002, "Kim");
        studentkim.addSubject("국어", 90);
        studentkim.addSubject("수학", 90);
        studentkim.addSubject("영어", 100);

        studentLee.showStudentINfo();
        System.out.println("==========================");
        studentkim.showStudentINfo();
    }
}
