import javax.security.auth.Subject;
import java.util.ArrayList;
public class Student {
    int StudentID;
    String StudentName;
    ArrayList<Subject> subjectList; //ArrayList 선언허기
    /* studet class의 멤버 변수 */
    public Student(int StudentID, String studentName) {
        this.StudentID=StudentID;
        this.StudentName=studentName;
        subjectList = new ArrayList<Subject>(); //
    }
    /* 생성자 */

    public void addSubject(String name, int score){
        Subject subject = new Subject(); //subject 생성하기
        Subject.setName(name); // 과목 이름 추가하기
        Subject.setScorePoint(score); // 과목 점수 추가하기
        subjectList.add(subject); //배열에 저장하기
    } /* 학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드 */

    public void showStudentINfo(){
        int total = 0;
        for ( Subject s: subjectList ){
        total += s.getScorePoint();
            System.out.println("학생" +StudentName + "의 "+ s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다.");
    } // 배열 요소 값 출력
        System.out.println("학생" +StudentName + "의 총점은" + total + "입니다.");
    }
 }
