package report02;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      Student[] a = {
            new Student(14069, "박**", "수학",3),new Student(12051, "황**", "경영",4),
            new Student(15220, "백**", "디자인",2),new Student(12481, "박**", "수학",4),
            new Student(15505, "장**", "영문",2),new Student(16962, "정**", "수학",1),
            new Student(15376, "최**", "컴퓨터",2),new Student(16420, "진**", "경제",2),
            new Student(11293, "김**", "컴퓨터",4),new Student(10184, "강**", "경영",3),
            new Student(16104, "김**", "컴퓨터",1),new Student(10390, "한**", "경영",4),
            new Student(14758, "이**", "컴퓨터",2)
      };
      Arrays.sort(a);  print(a,"ID");
      Arrays.sort(a,Student.WITH_DEPT);print(a,"학과");
      Arrays.sort(a,Student.WITH_NAME);print(a,"이름");
      Arrays.sort(a,Student.WITH_GRADE);print(a,"학년");
      
   }

private static void print(Student[] a, String string) {
    for(Student  student : a) {
       System.out.println(student.getID()+" " + student.getDept() +"   "+ student.getName() +"  "+ student.getGrade());
    }
}

}
