public class OffsiteCourse extends Course{
    private String townName;
    public void setTownName(String townName){
        this.townName=townName;
    }
    public String getTownName()
    {
        return townName;
    }
     public void printCourse()
 {
    System.out.print(this.getClass().getName()+ " : ");
     System.out.println("Name = "+getCourseName());
     System.out.println("Teacher = "+getTeacher().getTeacherName());
     System.out.println("Topics ="+getTopic());
     System.out.println("Town : "+townName);
 }
}