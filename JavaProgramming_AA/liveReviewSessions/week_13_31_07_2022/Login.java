package week_13_31_07_2022;

public class Login {
    public static void main(String[] args) {

        Credentials user = new Credentials();

        System.out.println("user email" + user.email);

        System.out.println(user.getUserName("asdad@tewe.com"));

        System.out.println(user.getPassWord("asdad@tewe.com", "UserWild"));

    }
}
