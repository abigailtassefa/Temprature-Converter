package schoolmanagementsystem;
/**
 * teacher class is responsible for tracking a teachers id, name and salary
 */
public class Teacher{
    private int id;
    private String name;
    private int salary;
/**
 * This parametizied constructor is used to initialize 
 * the instance variables of the teacher class
 * @param id is the unique id for the teacher : unique and constant ie final
 * @param name is the name of the teacher
 * @param salary is the salary of the teacher
 */
public Teacher(int id, String name, int salary){
    this.id=id;
    this.name=name;
    this.salary=salary;

}
// we want to get the name, id and salary 

public String getName(){
    return name;
}

public int getID(){
    return id;
}

public int getSalary(){
    return salary;
}

// setting a salary 

public void setSalary(int salary){
    this.salary=salary;
}



//not altering name and id
// altering teacher salary because of promotion
/* 
public void updatesalary(int newsalary){
    salary+=newsalary;
}*/
}