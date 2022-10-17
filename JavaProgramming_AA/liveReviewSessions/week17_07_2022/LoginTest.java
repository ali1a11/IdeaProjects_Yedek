package week17_07_2022;

public class LoginTest {
    public static void main(String[] args) {

    }

    public static boolean login(String username, String password){
        if(username.equalsIgnoreCase("Student1") && password.equalsIgnoreCase("pasword123")){
            return true;
        }
        return false;
    }

    // public static String login(String username, String password){ NOT METHOD OVERLOADING

    public static boolean login(){
        if(getUsername().equalsIgnoreCase("Student1") && getPassword().equalsIgnoreCase("pasword123")){
            return true;
        }
        return false;

    }

    public static String getPassword(){
        return "pasword123";
    }

    public static String getUsername(){
        return "Student1";
    }


}
