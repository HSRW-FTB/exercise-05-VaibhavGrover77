import java.util.Date;

    public class Student extends User{
        private int id;
        private static int idGen = 10000;
        private String lastname;
        private String firstname;
        private Date birthdate;
        private StudyCourse studycourse;
    
    
        private Student(){
            id = idGen;
            idGen++;
        }
        public Student(String init_firstname, String init_lastname){
            super(Integer.toString(idGen),Domain.STUDENT,init_firstname,init_lastname);
            idGen++;
        }
        public Student(String init_firstname, String init_lastname,Date init_birthdate){
            super(Integer.toString(idGen),Domain.STUDENT,init_firstname,init_lastname,init_birthdate);
            idGen++;
        }
        public StudyCourse getStudyCourse() {
            return this.studycourse;
        }
        public String getStudyCourseDescription(){
            switch(studycourse){
                case ME: 
                    return "Mechanical Engineering, B.Sc.";
                case MSE:
                    return "Mechatronic Systems Engineering, B.Sc.";
                case EL:
                    return "Electrical Engineering, B.Sc.";
                case IE:
                    return "Industrial Engineering, B.Sc.";
                case BMS:
                    return "Bionics/Biomimetics, M.Sc.";
                case SCB:
                    return "Science Communication & Bionics, B.Sc.";
                case MME:
                    return "Mechanical Engineering, M.Sc.";
                case MBB:
                    return "Bionics, M.Sc.";
                default:
                    return "No Study Course";
            }
        }
    
        public void setStudyCourse(StudyCourse studycourse) {
            this.studycourse = studycourse;
        }
        public void setStudyCourse(String studycourse) {
            this.studycourse = StudyCourse.valueOf(studycourse);
        }
    
    }
    

