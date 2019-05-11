/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Users {
    private int userId;
    private String userEmail;
    private String userName;
    private String userAddress;
    private String userPass;
    private boolean userRole;

    public Users() {
    }

    public Users(int userId, String userEmail, String userPass, boolean userRole) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userRole = userRole;
    }
    
    public int getUserId() {
        return userId;
    }

    public Users(String userEmail, String userPass, boolean userRole) {
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userRole = userRole;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public boolean isUserRole() {
        return userRole;
    }

    public void setUserRole(boolean userRole) {
        this.userRole = userRole;
    }

    public void getUserId(long aLong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
