public class Student {
    private int StudentID;
    private String name;

    public Student(int StudentID, String name){
        this.StudentID=StudentID;
        this.name=name;
    }
    public int getStudentID(){
        return StudentID;
    }
    public void setStudentID(int StudentID){
        this.StudentID=StudentID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void showStudentInfo(){
        System.out.println(StudentID + ", " +name);
    }
}
