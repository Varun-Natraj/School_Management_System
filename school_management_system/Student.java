public class Student extends Person {
    private String grade;
    private String studentID;
    private String courseName;
    public Student(int id,String name,int age,String address,String grade,String studentID,String courseName){
        super(id,name,age,address);
        this.grade=grade;
        this.studentID=studentID;
        this.courseName=courseName;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    @Override
    public void displayDetails(){
         super.displayDetails();
         System.out.println("Grade: "+grade+", Student Id: "+studentID+"Course Name:"+courseName);
    }
}