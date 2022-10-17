package day_31_Constructor.scrumTask;
/*
create a class called MyScrumTeam:
1. create an array of Testers and add the testers from your group
2. create an array of developers add the developers from your group
3. create an object of ScrumTeam and store the testers & developers above to the scrum team

3 testers objects
4 developers objects
1 ScrumTeam object
 */

public class MyScrumTeam {
    public static void main(String[] args) {

        // 4 testers
        Tester tester1 =new Tester("Tom", 11, "QA", 110000);
        Tester tester2 =new Tester("Jack", 24, "SDET", 142000);
        Tester tester3 =new Tester("Jesica", 22, "SE", 135000);
        Tester tester4 =new Tester("Mary", 34, "SDET", 115000);

        Tester[] testers = {tester2, tester3, tester4};

        //4 developers
        Developer developer1 = new Developer("Olga", 20, "Java Developer", 125000);
        Developer developer2 = new Developer("Jane", 21, "Java Master", 185000);
        Developer developer3 = new Developer("Tom", 28, "Software Developer", 135000);
        Developer developer4 = new Developer("George", 32, "Senior Developer", 200000);

        Developer[] developers = {developer2, developer3, developer4};

        //1 ScrumTeam object
        ScrumTeam scrum = new ScrumTeam("David", "Hans", "Helga", 14);
        System.out.println("scrum = " + scrum);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println("scrum = " + scrum);

        //-------------------------------------------

        //to reach testers in the scrum

        for (Tester eachtester : scrum.testersList) {
            System.out.println("Testers in the scrum:");
            System.out.println(eachtester.name + " : " + eachtester.salary);
        }


        //to reach developers in the scrum

        for (Developer eachdeveloper : scrum.devOpsList) {
            System.out.println("Developers in the scrum:");
            System.out.println(eachdeveloper.name + " : " + eachdeveloper.salary);
        }
        
        
        scrum.removeTester(34);
        scrum.removeDeveloper(21);

        System.out.println("scrum = " + scrum);

    }
}
