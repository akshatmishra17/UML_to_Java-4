import java.util.ArrayList;
import java.util.List;

public class EquipmentClass extends Equipment {
    private List<EquipmentClassProperty> classProperties = new ArrayList<>();
    private List<EquipmentClass> aggregatedClasses = new ArrayList<>();
    private List<EquipmentClassProperty> properties = new ArrayList<>();

    public void addClassProperty(EquipmentClassProperty classProperty) {
        classProperties.add(classProperty);
    }

    public void addAggregatedClass(EquipmentClass equipmentClass) {
        aggregatedClasses.add(equipmentClass);
    }

    public void addProperty(EquipmentClassProperty property) {
        properties.add(property);
    }

    public List<EquipmentClassProperty> getClassProperties() {
        return classProperties;
    }
}
