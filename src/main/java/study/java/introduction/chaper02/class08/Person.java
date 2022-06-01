package study.java.introduction.chaper02.class08;

import lombok.Builder;

public class Person {

    private String userName;
    private int age;
    private String gender;
    private int height;
    private int weight;

    @Builder
    public Person(String userName, int age, String gender, int height, int weight) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String showPersonInfo() {
        return "키가 "+height+" 이고 몸무게가 "+weight+" 킬로인 "+gender+"이 있습니다. 이름은 "+userName+" 이고 나이는 "+age+"세 입니다.";
    }


}
