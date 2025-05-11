public class Client {
    public static void main(String[] args) {
        College mainUni = new College("New Era University");
        College dept = new College("CICS");

        CollegeDepartment cs = new CollegeDepartment("Computer Science");
        cs.include(new Teachers("Prof. Jerry Esperanza", "Software Development", 67000));
        cs.include(new Students("Deen Dela Cruz", "CS-113", 11236));
        cs.include(new Students("Mark Larroza", "CS-030", 9384));

        CollegeDepartment it = new CollegeDepartment("Information Technology");
        it.include(new Teachers("Prof. Juan Dela Cruz", "Networking", 34000));
        it.include(new Students("Elmo Castillo", "IT-001", 7122));

        dept.include(cs);
        dept.include(it);
        mainUni.include(dept);

        System.out.println("=== UNIVERSITY OVERVIEW ===");
        mainUni.printStructure();

        System.out.println("\n=== CS DIVISION SUMMARY ===");
        System.out.println("Course: " + cs.title());
        System.out.println("Student Count: " + cs.totalEnrollees());
        System.out.printf("Budget Total: $%.2f\n", cs.financialBalance());

        System.out.println("\n=== UNIVERSITY TOTAL ===");
        System.out.println("Total Students: " + mainUni.totalEnrollees());
        System.out.printf("Total Budget: $%.2f\n", mainUni.financialBalance());
    }
}
