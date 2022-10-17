package day_27_WrapperClasses.Tasks;

/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";

 */



public class Task3 {
    public static void main(String[] args) {
        String str = "Wooden Spoon!";
        String letters = "";
        String digits = "";
        String specialChars = "";

        char[] chars = str.toCharArray();

        for (char each : chars) {

            if (Character.isLetter(each)) {
                letters += each;
            }

            if (Character.isDigit(each)) {
                digits += each;
            }
            if (!Character.isLetterOrDigit(each)) {
                specialChars += each;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";
		output:	true
 */
        String str1 = "JAVA java";

        char[] chars2 = str1.toCharArray();

        int countLowerCase = 0;
        int countUpperCase = 0;

        for (char each : chars2) {
            if(Character.isLowerCase(each)){
                countLowerCase++;
            }
            if(Character.isUpperCase(each)){
                countUpperCase++;
            }

            if (countLowerCase==countUpperCase){
                System.out.println("true");
            }
        }




}
}
