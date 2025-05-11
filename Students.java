public class Students implements UnitComponent {
    private final String fullName;
    private final String studentCode;
    private final double fee;

    public Students(String fullName, String studentCode, double fee) {
        this.fullName = fullName;
        this.studentCode = studentCode;
        this.fee = fee;
    }

    @Override
    public String title() {
        return fullName;
    }

    @Override
    public int totalEnrollees() {
        return 1;
    }

    @Override
    public double financialBalance() {
        return -fee; // Revenue from student
    }

    @Override
    public void printStructure() {
        System.out.printf("Learner: %s (ID: %s) | Tuition: $%.2f\n", fullName, studentCode, fee);
    }
}
