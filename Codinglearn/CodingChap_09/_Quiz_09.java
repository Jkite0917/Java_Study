package Study.Codinglearn.CodingChap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("유재석", "파이썬"));
        stu.add(new Student("박명수","자바"));
        stu.add(new Student("김종국","자바"));
        stu.add(new Student("조세호","C"));
        stu.add(new Student("서장훈","파이썬"));

        Iterator<Student> it = stu.iterator();

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");
        while(it.hasNext()) {
            Student student = it.next();
            String cer = student.certificate;
            if (cer.equals("자바")) {
                System.out.println(student.name);
            }
        }

        System.out.println();

        for(Student student : stu) {
            if(student.certificate.equals("자바")) {
                System.out.println(student.name);
            }
        }
    }

}
class Student {
    public String name;
    public String certificate;

    public Student(String name, String certificate) {
        this.name = name;
        this.certificate = certificate;
    }
}
