import java.util.*;
import java.util.List;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class BS23Test
{
   public static void main(String[] args){
      Scanner myobj = new Scanner(System.in);
      int testCases = Integer.parseInt(myobj.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = myobj.nextInt();
         String fname = myobj.next();
         double cgpa = myobj.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       Collections.sort(studentList, new Comparator<Student>() {
              @Override
               public int compare(Student s1, Student s2) {
                    if(s2.getCgpa()>s1.getCgpa()){
                        return 1;
                    }else if(s2.getCgpa()<s1.getCgpa()){
                        return -1;
                    }
                    return s1.getFname().compareTo(s2.getFname());
                }
        });
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}