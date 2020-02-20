public class CampusCourse extends Course{
    private String labNo;
   public CampusCourse(){

    }
 public void setLabNo(String labNo)
 {
     this.labNo=labNo;
 }
 public String getLabNo()
 {
     return labNo;
 }
 public void printCourse()
 {
     
     System.out.print(this.getClass().getName()+" : ");
     System.out.println("Name = "+getCourseName());
     System.out.println("Teacher : "+getTeacher().getTeacherName());
     System.out.println("Topics = "+getTopic());
     System.out.println("Lab No : "+labNo);
 }

}