package schoolmanagementsystem;

import java.util.List;

/**
 * school class has attributes of teachers, students, money earcned and spent A
 * school has many teachers and students ie we need an arraylist (dynamic array)
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * school constructor is created to initialize teachers and students
     *
     * @param teachers list of teachers
     * @param students list of students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    //altering total money spent and earned 
    // altering teachers and students bc new people get added or others leave 
    //ie we need setters (setting means equaling the "this." which is from the class with the parameter from the arguments in the method)
    // we also need getters (getting means returning the value)
  /*he eraesed set tecaher,student, total money earned and spent because we are not setting these values we are updating them
    
    
*/
//getting and adding teachers
/**
 * get teachers is used to return the list of teachers in the school
 * @return
 */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Teacher with caps T is the class name which is also a user defined data
     * type teachers is the array name
     *
     * @param teacher is the new teacher to be added
     */
    public void addTeacher(Teacher teacher) { //adds a teacher to the school
        teachers.add(teacher);
    }
/**
 * @return is used to return the list of students in the school
 */
    public List<Student> getStudents() {
        return students;
    }
    /**
     * green Student with caps S is the class name
     * @param student is the student to be added
     * blue students is the array name 
     */
public void addStudent(Student student){
    students.add(student);
}




    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }


    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * update total money spent is used to update the money that is spent by the school which is the salary given to teachers
     * @param moneySpent the only spending is payment/salary to the teachers
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -=moneySpent;
    }

}
