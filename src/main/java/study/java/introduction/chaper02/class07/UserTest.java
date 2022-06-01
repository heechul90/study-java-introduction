package study.java.introduction.chaper02.class07;

public class UserTest {

    public static void main(String[] args) {
        UserInfo lee = new UserInfo();
        lee.setUserId("qq12345");
        lee.setUserPassword("zzzzz");
        lee.setUserName("Lee");
        lee.setPhoneNumber("01011112222");
        lee.setUserAddress("세종");

        System.out.println(lee.showUserInfo());

        UserInfo kim = new UserInfo("qq12345", "zzzzz", "Kim");
        System.out.println(kim.showUserInfo());
    }
}
