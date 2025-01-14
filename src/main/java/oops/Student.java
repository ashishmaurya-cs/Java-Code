package oops;

public class Student extends College{
    private final String studentName;


    Student(String studentName,String collegeName) {
        super(collegeName);
        this.studentName=studentName;
    }



    public static void main(String[] args) {
      Student s=new Student("Anoop","RKGEC");
      System.out.println(s.getCollegeName()+" "+ s.studentName);
    }


}
