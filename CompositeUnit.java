import java.util.ArrayList;
import java.util.List;

public abstract class CompositeUnit implements UnitComponent {
    private final String title;
    private final List<UnitComponent> components = new ArrayList<>();

    public CompositeUnit(String title) {
        this.title = title;
    }

    public void include(UnitComponent component) {
        components.add(component);
    }

    public void exclude(UnitComponent component) {
        components.remove(component);
    }

    protected List<UnitComponent> getComponents() {
        return components;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public int totalEnrollees() {
        return components.stream().mapToInt(UnitComponent::totalEnrollees).sum();
    }

    @Override
    public double financialBalance() {
        return components.stream().mapToDouble(UnitComponent::financialBalance).sum();
    }
}
