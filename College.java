public class College extends CompositeUnit {
    public College(String name) {
        super(name);
    }

    @Override
    public void printStructure() {
        System.out.println("Department: " + title());
        System.out.println("Enrollees: " + totalEnrollees());
        System.out.printf("Budget Summary: $%.2f\n", financialBalance());
        System.out.println("\nInstitutional Structure:");
        getComponents().forEach(UnitComponent::printStructure);
    }
}
