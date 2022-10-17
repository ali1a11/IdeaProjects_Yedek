package day_14_String;
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail
 */

public class EmailDomain {
    public static void main(String[] args) {

        String eMail = "XYZ@gmail.com";

        String domain = eMail.substring(eMail.indexOf("@")+1, eMail.indexOf("."));
        System.out.println("domain = " + domain); // domain = gmail

    }
}

