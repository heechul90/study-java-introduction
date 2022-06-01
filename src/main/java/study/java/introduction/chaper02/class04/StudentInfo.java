package study.java.introduction.chaper02.class04;

public class StudentInfo {

    public static void main(String[] args) {

        Student lee = new Student();
        lee.studentName = "이순신";
        lee.address = "세종";

        lee.showStudentInfo();

        Student yun = new Student();
        yun.studentName = "윤석열";
        yun.address = "서울";

        yun.showStudentInfo();

        System.out.println("lee = " + lee);
        System.out.println("yun = " + yun);

    }
}
