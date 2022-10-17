package deneme.MOOC7.GradeRegister;

import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.points = new ArrayList<>();
    }

    public void addPoints(int point) {
        if (point < 0 || point > 100) {
            return;
        }

        this.points.add(point);
    }

    public void pointsAverage() {
        int pointsSum = 0;
        for (Integer each : points) {
            pointsSum += each;
        }
        System.out.println("Point average (all): " + 1.0 * pointsSum / points.size());
    }

    public void getPassingPointsAverage() {
        int passingPointsSum = 0;
        int numberOfPassing = 0;
        for (Integer each : points) {
            if (each >= 50) {
                passingPointsSum += each;
                numberOfPassing++;
            }
        }
        System.out.println("Point average (passing): " + ((numberOfPassing == 0) ? "-" : +1.0 * passingPointsSum / numberOfPassing));
    }

    public void getPassPersantage() {
        int count = 0;
        for (Integer each : points) {
            if (each >= 50) {
                count++;
            }
        }
        System.out.println("Pass percentage: " + 1.0 * count / points.size() * 100);
    }

    public void getGradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + printStars(i));
        }
    }

    public String printStars(int grade) {
        int howManyStars = 0;
        for (Integer point : points) {
            if (convertPointsToGrade(point) == grade) {
                howManyStars++;
            }
        }
        return stars(howManyStars);
    }

    public String stars(int n) {
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        return stars;
    }

    public int convertPointsToGrade(int point) {
        int grade = 0;
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
}
