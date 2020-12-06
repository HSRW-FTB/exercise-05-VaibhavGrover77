import java.util.Date;
public class Classroom {
    private String id;
    private Course course;
    private Student[] participants;
    private String room;
    private String term;
    //private Date date;

    private Classroom(){}

    public Classroom(Course course, String room){
        this.course = course;
        this.room = room;
    }

    public Classroom(Course course, String room, Date date){
        this.course = course;
        this.room = room;
        //this.date = date ; 
    }
    public Course getCourse(){
        return course ;
    }
    public String getRoom(){
        return room;
    }
    public void setRoom(String room){
        this.room = room;
    }
    public String getTerm(){
        return term;
    }
    public String getID(){
        return id;
    }
    
    // add student 

    public String getParticipantsEmail(){
        return ;
    }
}
