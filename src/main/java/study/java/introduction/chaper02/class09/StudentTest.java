package study.java.introduction.chaper02.class09;

public class StudentTest {

    public static void main(String[] args) {

        Student lee = new Student(1, "Lee");
        lee.setKoreaSubject("국어", 90);
        lee.setMathSubject("수학", 100);

        Student kim = new Student(1, "Lee");
        kim.setKoreaSubject("국어", 80);
        kim.setMathSubject("수학", 90);

        lee.showScoreInfo();
        kim.showScoreInfo();

    }
}
