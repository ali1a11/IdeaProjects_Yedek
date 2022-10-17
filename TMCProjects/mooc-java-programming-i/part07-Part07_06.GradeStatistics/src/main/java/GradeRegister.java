import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.points = new ArrayList<>();
    }


    public void addPoints(int point) {
        this.points.add(point);
    }

    public void pointsAverage() {
        int total = 0;
        for (Integer each : points) {
            total += each;
        }
        System.out.println("Point average (all): " + 1.0 * total / points.size());
    }

    public void getPassingPointsAverage() {
        int total = 0;
        int count = 0;
        for (Integer each : points) {
            if (each >= 50) {
                total += each;
                count++;
            }
        }
        System.out.println("Point average (passing): " + ((count == 0) ? "-" : +1.0 * total / count));
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
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;
        for (Integer point : points) {
            if (point < 50) {
                grade0++;
            } else if (point < 60) {
                grade1++;
            } else if (point < 70) {
                grade2++;
            } else if (point < 80) {
                grade3++;
            } else if (point < 90) {
                grade4++;
            } else {
                grade5++;
            }
        }
        System.out.println("Grade distribution:");
        System.out.print("5:");
        printStar(grade5);
        System.out.println();
        System.out.print("4:");
        printStar(grade4);
        System.out.println();
        System.out.print("3:");
        printStar(grade3);
        System.out.println();
        System.out.print("2:");
        printStar(grade2);
        System.out.println();
        System.out.print("1:");
        printStar(grade1);
        System.out.println();
        System.out.print("0:");
        printStar(grade0);
    }

    public void printStar(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }


    @Override
    public String toString() {
        return "GradeRegister{" +
                "points=" + points +
                '}';
    }
}
