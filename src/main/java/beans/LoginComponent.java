package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by aytac.akkaya on 24.07.2018.
 */
@ManagedBean(name = "lgCom")
@SessionScoped
public class LoginComponent {
    private String userName;
    private String password;

    private String login() {
        System.out.println("Giriş Yapıldı.");
        return "result";

    }

    //GETTER AND SETTER


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
