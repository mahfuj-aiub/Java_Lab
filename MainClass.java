import java.util.ArrayList;
import java.util.List;

public class MainClass{
    public static void main(String args[]){
        Teacher t1=new Teacher();
        t1.setTeacherName("Victor Stany Rozario");
        Teacher t2=new Teacher();
        t2.setTeacherName("Mahfujur Rahman");
        CampusCourse cc1=new CampusCourse();
        cc1.setLabNo("Cl6");
        cc1.setCourseName("OOP1");
       /* ArrayList<String> str=new ArrayList<String>();
        str.add("Using Classes");
        str.add("Objects");
        str.add("Defining Classes");
        str.add("OOP Principles");
        str.add("Property");*/
        
        cc1.setTeacher(t1);
        String[] str={"Using Classes and Objects","Defining Classes","OOP Priciples","Property"};
        cc1.setTopic(str);
        OffsiteCourse oc1=new OffsiteCourse();
        oc1.setTownName("Sylhet");
        oc1.setCourseName("Cyber Security");
        CampusCourse cc2=new CampusCourse();
        cc2.setLabNo("Cl10");
        cc2.setCourseName("OOAD");
        String[]str2={"Introduction to Modeling","Introduction to UMl","Use case Diagram","Classs diagram"};
        cc2.setTeacher(t1);
        cc2.setTopic(str2);
        /*ArrayList<String> str1=new ArrayList<String>();
        str1.add("Security");
        str1.add("Encryption Algorithm");
        str1.add("Cyber Ethics");*/
        String[] str1={"Security","Encryption Algorithm","Cyber Ethics"};
        oc1.setTopic(str1);
        oc1.setTeacher(t2);
        
        List<Course> camp=new ArrayList<Course>();
        camp.add(cc1);
        camp.add(cc2);
        
        
        t1.setCourses(camp);
        List<Course> off=new ArrayList<Course>();
        off.add(oc1);
        
        t2.setCourses(off);
        t1.addCourses(oc1);
        

        


        Course c=cc1;
        c.printCourse();
        c=oc1;
        c.printCourse();
        t1.print();
        t2.print();
    }
}