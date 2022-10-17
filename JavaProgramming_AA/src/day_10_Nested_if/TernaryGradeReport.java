package day_10_Nested_if;

/*
90-100 excellent
80-89 great
70-79 good
60-69 passed
0-59 failed
*/
public class TernaryGradeReport {
    public static void main(String[] args) {

        int score = 95;
/*
        String result = ""; //temporary // instead of using System.out.println() for if we define String variable and last ve print

            if (score >= 0 && score <= 100) {
                if (score >= 90) { // no need && score<=100
                    //System.out.println("Excellent");
                    result = "Excellent";
                } else if (score >= 80) { // no need && score<90
                    //System.out.println("Great");
                    result = "Great";
                } else if (score >= 70) { // no need && score<80
                    //System.out.println("Good");
                    result = "Good";
                } else if (score >= 60) { // no need && score<70
                    //System.out.println("Passed");
                    result = "Passed";
                } else {
                    //System.out.println("Not passed");
                    result = "Not passed";
                }

            } else {
                //System.out.println("invalid score");
                result = "invalid score";
            }
            System.out.println(result);
*/
        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" :
                (score >= 60) ? "Passed" : "Not passed" : "invalid score";

        System.out.println(result);
    }
}

