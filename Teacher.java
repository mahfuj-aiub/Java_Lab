
import java.util.ArrayList;
import java.util.List;


public class Teacher{
    private String teacherName;
    private ArrayList<Course> courses;
    private ArrayList<String>courseNameList=new ArrayList<String>();
    public void setTeacherName(String techerName)
    {
        this.teacherName=techerName;
    }
    public void setCourses(List<Course> camp){
        this.courses= (ArrayList<Course>) camp;
        for(Course i:camp)
        {
           courseNameList.add( i.getCourseName());
        }
    }
   public void addCourses(Course course){
        courses.add(course);
        courseNameList.add(course.getCourseName());
    }
    public String getTeacherName()
    {
        return teacherName;
    }
    public ArrayList<Course> getCourses()
    {
        return courses;
    }
    public ArrayList<String> getCourseNameList(){
        return courseNameList;
    }
   
    public void print(){
       System.out.print(getClass().getSimpleName()+" : ");
       System.out.println("Name = "+teacherName);
       System.out.println("Courses = "+ getCourseNameList());
    }

}