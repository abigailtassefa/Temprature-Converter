package schoolmanagementsystem;
 
//student class keeps track of 
//id, name, grade and fees
public class Student{
    private int id;
    private String name;
    private int grade;
    private int feesPaid; // fees that are supposed to be paid
    private int feesTotal; 

//student parameterized constructor to initialize the instance variables
// Q1: i believe that id should be final 
/**
 * fees foe every student is 30,000 birr
 * fees paid initially is 0
 * @param id id for the student: unique
 * @param name name if the student 
 * @param grade grade(class of the student)
 * @param feesPaid
 * @param feesTotal
 */
public Student(int id, String name, int grade){
    this.id=id;
    this.name=name;
    this.grade=grade;
    this.feesPaid=0;
    this.feesTotal=30000;
    //Q2: we didnt pass fees paid and fees total as parameters why? 
    //Q3: i believe that fees total should be a static variable
}

//not altering students name and id 
// altering student grade bc of promotion
/**
 * set grade is used to update the student's grade
 * @param grade is new grade of the student
 */

public void setGrade(int grade){
    this.grade=grade;
}

// fees total will not be altered 
// fees paid will be altered
/**
 * add the fees to fees paid 
 * eg. fees paid = 10,000 + 5,000 + 15,000
 * keep adding the fees to fees paid field
 * The school is going to recieve the funds
 * @param fees the fees that the student pays 
 */
public void updatefeespaid (int fees){
    feesPaid+=fees;

}
// we need to get(get means returning value) all of the attributes above

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }


}

