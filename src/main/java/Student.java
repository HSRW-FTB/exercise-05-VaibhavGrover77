import java.util.Date;

public class Student extends User {
    
    private static int idGen = 10000;
    private Course studycourse;
        
    private Student(){
        
        idGen++;
    
    }
    
    public Student(String firstname, String lastname){
        
        super(String.valueOf(idGen), Domain.STUDENT, firstname, lastname);
        idGen++;
    
    }  
    public Student(String firstname, String lastname, Date birthdate){
        
        super(String.valueOf(idGen), Domain.STUDENT, firstname, lastname, birthdate);
        idGen++;  
    }
        
    public Course getStudyCourse(){   
        return this.studycourse;    
    }
    
    public String getStudyCourseDescription(){
    
        int num = 0;
        String[] arr1 = { "ME", "MSE", "EL", "IE", "BMS", "SCB", "MME", "MBB" };
        String[] arr2 = {"Mechanical Engineering, B.Sc.", "Mechatronic Systems Engineering, B.Sc.", "Electrical and Electronics Engineering, B.Sc.", "Industrial Engineering, B.Sc.", "Biomaterials Science, B.Sc.", "Science Communication and Bionics, B.A./B.Sc.", "Mechanical Engineering, M.Sc.", "Bionics/Biomimetics, M.Sc."};
        
        for(int i = 0; i<7; i++){
                  if( arr1[i] == studycourse.name() ){              
                 num = i;         
            }
        }   
       return arr2[num];
    }
    
    public void setStudyCourse(Course course){    
        this.studycourse=course;   
    }   
    public void setStudyCourse(String ab){    
      this.studycourse = Course.valueOf(ab);       
    }                            
}

