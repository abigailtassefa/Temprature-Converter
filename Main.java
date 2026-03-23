package schoolmanagementsystem;
import java.util.ArrayList;
import java.util.List;


public static void main(String[] args){
        Teacher Abebe = new Teacher (001, "Abebe", 500);
        Teacher Zewditu = new Teacher (002, "Zewditu", 700);
        Teacher Vivian = new Teacher (003, "Vivian", 1000);
      
        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(Abebe);
         teachersList.add(Zewditu);
          teachersList.add(Vivian);
        
      
        Student Tamasha = new Student(1, "Tamasha", 4);
         Student rakshith = new Student(2, "Rakshith", 12);
         Student rabbi = new Student(3, "Rabbi", 5);
    
         List<Student> studentsList = new ArrayList<>();
         studentsList.add(Tamasha);
         studentsList.add(rakshith);
         studentsList.add(rabbi);

         School AddisAbabaSchool = new School(teachersList, studentsList);
         
         



        }