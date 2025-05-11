public class CollegeDepartment extends CompositeUnit {
    public CollegeDepartment(String name) {
        super(name);
    }

    @Override
    public void printStructure() {
        System.out.println("\nCourse: " + title());
        System.out.println("Students Enrolled: " + totalEnrollees());
        System.out.printf("Subdivision Budget: $%.2f\n", financialBalance());

        System.out.println("\nFaculty:");
        getComponents().stream().filter(c -> c instanceof Teachers).forEach(UnitComponent::printStructure);

        System.out.println("\nLearners:");
        getComponents().stream().filter(c -> c instanceof Students).forEach(UnitComponent::printStructure);
    }
}
