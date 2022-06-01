package study.java.introduction.chaper02.class06;

public class StudentTest {

    public static void main(String[] args) {

        Student iu = new Student(20091287, "아이유", 2);
        String info = iu.showStudentInfo();
        System.out.println("info = " + info);

    }
}
