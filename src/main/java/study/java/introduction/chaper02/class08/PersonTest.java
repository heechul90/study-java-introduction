package study.java.introduction.chaper02.class08;

public class PersonTest {

    public static void main(String[] args) {

        Person jo = Person.builder()
                .userName("조인성")
                .age(40)
                .gender("남성")
                .height(180)
                .weight(78)
                .build();

        System.out.println("jo.showPersonInfo() = " + jo.showPersonInfo());
    }
}
