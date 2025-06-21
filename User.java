import constants.BookingStatus;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String userName;
    private String email;
    private String mobileNumber;

    public User(String userId, String mobileNumber, String email, String userName) {
        this.userId = userId;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.userName = userName;
    }



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
