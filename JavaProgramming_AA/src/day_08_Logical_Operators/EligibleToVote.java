package day_08_Logical_Operators;

public class EligibleToVote {

        public static void main(String[] args) {
            String name ="Steven";
            int age = 19;
            String citizen = "USA";
            boolean isEligible = age >= 18 && citizen == "USA";

            if (isEligible){
                System.out.println(name + " iseligible to vote: " + isEligible);
            }

            if (!isEligible){
                System.out.println(name + " iseligible to vote: " + isEligible);
            }




    }
}
