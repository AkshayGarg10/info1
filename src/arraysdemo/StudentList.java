package arraysdemo;


/**
 *
 * @author gaksh
 */
public class StudentList {
    public static void main(String[] args){
    
        Student s1 = new Student(11,"Akshat");
        System.out.println("hello");
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = new Student(2,"abc");
        studentList[2] = new Student(3,"xyz");
        
        for(Student s : studentList){
            System.out.println(s.getSname());
        }
        
        
        
    
    }// end of main
    
}
