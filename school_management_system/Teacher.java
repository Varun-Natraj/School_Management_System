public class Teacher extends Person {
    private String subject;
    private double salary;
    private double experience;
    public Teacher(int id,String name,int age,String address,String subject, double salary,double experience) {
        super(id,name,age,address);
        this.subject = subject;
        this.salary = salary;
        this.experience=experience;
    }
    @Override
    public void displayDetails(){
       super.displayDetails();
       System.out.println("Subject: " + subject+", Salary: " + salary +"experience:"+experience);
    }
}