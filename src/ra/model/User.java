package ra.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 16121998L;
    private int id;
    private String userName;
    private String passWord;
    private boolean status;

    public User() {
    }

    public User(int id, String userName, String passWord, boolean status) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
