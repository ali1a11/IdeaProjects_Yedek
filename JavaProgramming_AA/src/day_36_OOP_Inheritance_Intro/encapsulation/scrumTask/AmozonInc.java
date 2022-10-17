package day_36_OOP_Inheritance_Intro.encapsulation.scrumTask;

public class AmozonInc {
    public static void main(String[] args) {

        String company = "Amazon";
        ProductOwner po = new ProductOwner("John", 45, 'M', 125, 125000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Tom", 51, 'M', 86, 115000, company);

        ScrumMaster sm = new ScrumMaster("Jane", 36,'F',96,125000,company);

        Tester tester1 = new Tester("Mary", 32, 'F', "QA", 76, 111000,company);
        Tester tester2 = new Tester("Karen", 46, 'F',"SDET", 77, 132000,company);
        Tester tester3 = new Tester("Irena", 41, 'F',"QA", 71, 121000,company);
        Tester tester4 = new Tester("James", 31, 'M',"QA", 73, 126000, company);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Mike",45, 'M', "Java developer", 55, 135000, company);

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println("scrumTeam = " + scrumTeam);
        
        //--------------------------------
        // print testers' name in the scrum team

        System.out.println("Testers in the scrum team");
        for (Tester tester : scrumTeam.testers) {

            System.out.println(tester.name + " ID: " + tester.ID);
        }

        //--------------------------------
        // print developers' name in the scrum team

        System.out.println("Developers in the scrum team");
        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " ID: " + developer.ID);
        }


    }
}
