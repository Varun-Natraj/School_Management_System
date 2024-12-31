public class AdminStaff extends Person{
    private String department;
    private String role;
    private String clg;
    public AdminStaff(int id,String name,int age,String address,String department,String role,String clg){
        super(id,name,age,address);
        this.department = department;
        this.role = role;
        this.clg=clg;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department: "+department+", Role: "+role+"college:"+clg);
    }
}