package OOPSample;

public class UserInfo {
    public String userName;
    public String name;
    private String password;
    private  int yas;

    public UserInfo(String userName, String name, String password, int yas) {
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
