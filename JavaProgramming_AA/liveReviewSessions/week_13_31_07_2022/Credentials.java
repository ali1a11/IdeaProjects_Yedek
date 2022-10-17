package week_13_31_07_2022;

public class Credentials {
    public String email = "asdad@tewe.com";
    private String userName = "UserWild";
    private String passWord = "Pasword123";

    public String getUserName(String emailInput){
        if(emailInput.equalsIgnoreCase(email)){
            return this.userName;
        }
        return "condition has not been satisfied";
    }

    public String getPassWord(String emailInput, String userNameInput){
        if(emailInput.equalsIgnoreCase(email)&&userNameInput.equalsIgnoreCase(userName)){
            return this.passWord;
        }
        return "condition has not been satisfied";
    }

    public void setPassWord(String newPassword){
        this.passWord=newPassword;
    }
}
