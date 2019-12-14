package hw4.builders;

import java.io.*;
import java.util.*;

public class User {
    private String userName;
    private String userLogin;
    private String userPassword;

    private User(String userLogin, String userPassword, String userName) {
        this.userName = userName;
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    private static UserBuilder userBuilder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String userLogin;
        private String userPassword;
        private String userName;

        private UserBuilder() {
        }

        public UserBuilder setUserLogin(String userLogin) {
            this.userLogin = userLogin;
            return this;
        }

        public UserBuilder setUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build() {
            return new User(this.userLogin, this.userPassword, this.userName);
        }
    }

    public static User createUserFromPropertyFile(final String propertyFilePath) {
        User user = null;
        File propertyFile = new File(propertyFilePath);
        Properties properties = new Properties();

        try {
            properties.load(new FileReader(propertyFile));
            user = User.userBuilder()
                    .setUserLogin(properties.getProperty("userLogin"))
                    .setUserPassword(properties.getProperty("userPassword"))
                    .setUserName(properties.getProperty("userName"))
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }
}
