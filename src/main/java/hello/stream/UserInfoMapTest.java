package hello.stream;

import java.util.ArrayList;
import java.util.List;

public class UserInfoMapTest {
    public static void main(String[] args) {
        UserInfo userKim = new UserInfo("김도희", 35);
        UserInfo userLee = new UserInfo("이나영", 40);
        UserInfo userPark = new UserInfo("박영수", 55);

        List<UserInfo> userInfoList = new ArrayList<>();

        userInfoList.add(userKim);
        userInfoList.add(userLee);
        userInfoList.add(userPark);

        userInfoList.stream()
                .filter(user -> user.getAge() >= 40)
                .map(UserInfo::getName)
                .forEach(s -> System.out.println(s));

    }
}
