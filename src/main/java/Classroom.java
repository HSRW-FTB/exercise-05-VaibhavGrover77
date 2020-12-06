import java.util.ArrayList;
import java.util.Calender;
impport java.util.GregorianCalender;
import java.util.Date;

public class Classroom {
    private String id;
    private Course course;
    private ArrayList<Student> participants = new ArrayList<Student>();
    private String room;
    private String term;
    //private Date date;

    private Classroom(){}

    public Classroom(Course course, String room){
        this.course = course;
        this.room = room;
        Date date = new Date();
        Calender calender = new GregorianCalender();
        int year = Calender.get(Calender.YEAR);
        int month = calender.get(Calender.MONTH) + 1;
        if (month<10 && month>2){
            term = "SS" + year + "/" + ((year +1 ) %100);}
        else{ term = "WS" + year + "/" + ((year +1 ) %100);}
        this.id = course.getID()+ "-" + term;
    }

    public Classroom(Course course, String room, Date date){
        this.course = course;
        this.room = room;
        Calender calender = new GregorianCalender();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        if (month<10 & month >2){
            term = "SS"+year+"/"+((year+1)%100);}
        else{
            term = "WS"+year+"/"+((year+1)%100);}
        
        this.id=course.getID()+"-"+ term;
        
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
    public void addStudent(Student student){
        participant.add(student);}

    public String getParticipantsEmail(){
        String emails = "";
         for (int i=0; i < participants.size();i++){
            emails = emails + participants.get(i).getFQUN() + ", ";
        }
        return emails.substring(0, emails.length() - 2);
    }
    public int getTotalParticipants(){
        return participants.size();
    }
}
