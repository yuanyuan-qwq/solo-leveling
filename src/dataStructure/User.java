package dataStructure;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -7660008245406990218L;

    String userId;
    String userName;
    transient String nric;
    int age;

    public User() {
    }

    public User(String userId, String userName, String nric, int age) {
        this.userId = userId;
        this.userName = userName;
        this.nric = nric;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", nric='" + nric + '\'' +
                ", age=" + age +
                '}';
    }
}
