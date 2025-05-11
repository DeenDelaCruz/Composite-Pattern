public class Teachers implements UnitComponent {
    private final String name;
    private final String specialization;
    private final double wage;

    public Teachers(String name, String specialization, double wage) {
        this.name = name;
        this.specialization = specialization;
        this.wage = wage;
    }

    @Override
    public String title() {
        return name;
    }

    @Override
    public int totalEnrollees() {
        return 0;
    }

    @Override
    public double financialBalance() {
        return wage; // Expense to institution
    }

    @Override
    public void printStructure() {
        System.out.printf("Instructor: %s | Field: %s | Wage: $%.2f\n", name, specialization, wage);
    }
}
