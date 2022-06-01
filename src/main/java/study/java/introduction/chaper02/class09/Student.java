package study.java.introduction.chaper02.class09;

import lombok.Setter;

@Setter
public class Student {

    private int studentId;
    private String studentName;

    Subject korea;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.setSubjectName(name);
        korea.setScore(score);
    }

    public void setMathSubject(String name, int score) {
        math.setSubjectName(name);
        math.setScore(score);
    }

    public void showScoreInfo() {
        int total = korea.getScore() + math.getScore();
        System.out.println(studentName + " 학생의 총점은 " + total + " 점 입니다.");
    }



}
