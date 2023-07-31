import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private List<EquipmentProperty> properties = new ArrayList<>();
    private List<Equipment> aggregatedEquipment = new ArrayList<>();
    private List<EquipmentProperty> values = new ArrayList<>();

    public void addProperty(EquipmentProperty property) {
        properties.add(property);
    }

    public void addAggregatedEquipment(Equipment equipment) {
        aggregatedEquipment.add(equipment);
    }

    public void addValue(EquipmentProperty value) {
        values.add(value);
    }

    public List<EquipmentProperty> getProperties() {
        return properties;
    }
}
