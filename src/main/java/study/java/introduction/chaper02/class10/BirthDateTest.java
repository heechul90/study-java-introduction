package study.java.introduction.chaper02.class10;

import java.time.LocalDateTime;

public class BirthDateTest {

    public static void main(String[] args) {

        BirthDate birthDate = new BirthDate();
        LocalDateTime now = LocalDateTime.now();
        birthDate.setYear(now.getYear());
        birthDate.setMonth(now.getMonthValue());
        birthDate.setDay(now.getDayOfMonth());

        birthDate.showDate();
    }
}
