package service;

import models.Login;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class CheckLoginService {
  private static List<User> users;

  static {
    users = new ArrayList<>();
    users.add(new User("1", "1", "cong", "congnv.9803@gmail.com", 25));
    users.add(new User("2", "2", "hai", "hainv.9803@gmail.com", 22));
    users.add(new User("3", "3", "ba", "banv.9803@gmail.com", 33));
  }

  public static User checkLogin(Login login) {
    for (User user : users) {
      if (login.getAccount().equals(user.getAccount()) && login.getPassword().equals(user.getPassword())) {
        return user;
      }
    }
    return null;
  }
}
