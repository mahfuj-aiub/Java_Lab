import java.util.ArrayList;

abstract class Course{
    private String courseName;
    private Teacher teacher;
    private static ArrayList<String> topic=new ArrayList<String>();
    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void setTopic(String[] t)
    {
        for(String i:t){
            topic.add(i);
        }

    }
    public void setTeacher(Teacher teacher)
    {
        this.teacher=teacher;
    }
    public Teacher getTeacher()
    {
        return teacher;
    }
    public void addTopic(String t){
        topic.add(t);
    }
    public ArrayList<String> getTopic(){
        return topic;
    }
    public void printCourse()
    {

    }

}