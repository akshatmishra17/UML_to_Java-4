import java.util.ArrayList;
import java.util.List;

public class PhysicalAssetClass extends PhysicalAsset {
    private List<PhysicalAssetClassProperty> classProperties = new ArrayList<>();
    private List<PhysicalAssetClass> aggregatedClasses = new ArrayList<>();
    private List<PhysicalAssetClassProperty> properties = new ArrayList<>();

    public void addClassProperty(PhysicalAssetClassProperty classProperty) {
        classProperties.add(classProperty);
    }

    public void addAggregatedClass(PhysicalAssetClass assetClass) {
        aggregatedClasses.add(assetClass);
    }

    public void addProperty(PhysicalAssetClassProperty property) {
        properties.add(property);
    }

    public List<PhysicalAssetClassProperty> getClassProperties() {
        return classProperties;
    }
}
