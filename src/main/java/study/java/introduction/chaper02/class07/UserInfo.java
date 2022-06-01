package study.java.introduction.chaper02.class07;

import lombok.Setter;

@Setter
public class UserInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAddress;
    private String phoneNumber;

    public UserInfo() {

    }

    public UserInfo(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + " 이고, 등록된 이름은 " + userName + " 입니다.";
    }
}
