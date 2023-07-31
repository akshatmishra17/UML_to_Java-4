import java.util.List;

public class Main {
    public static void main(String[] args) {

        Equipment equipment = new Equipment();
        equipment.addProperty(new EquipmentProperty("Weight", "200 kg"));
        equipment.addProperty(new EquipmentProperty("Color", "Black"));
        equipment.addProperty(new EquipmentProperty("Material", "Iron"));

        EquipmentClass equipmentClass = new EquipmentClass();
        equipmentClass.addClassProperty(new EquipmentClassProperty("Model", "UP12345"));
        equipmentClass.addClassProperty(new EquipmentClassProperty("Manufacturer", "TATA"));
        equipmentClass.addClassProperty(new EquipmentClassProperty("Manufactured Date", "16/09/2015"));

        PhysicalAsset physicalAsset = new PhysicalAsset();
        physicalAsset.addProperty(new PhysicalAssetProperty("Weight", "300 kg"));
        physicalAsset.addProperty(new PhysicalAssetProperty("Color", "Red"));
        physicalAsset.addProperty(new PhysicalAssetProperty("Dimensions", "20x20"));

        PhysicalAssetClass physicalAssetClass = new PhysicalAssetClass();
        physicalAssetClass.addClassProperty(new PhysicalAssetClassProperty("Model", "UP1067"));
        physicalAssetClass.addClassProperty(new PhysicalAssetClassProperty("Manufacturer", "ABC Corporation"));

        EquipmentAssetMapping mapping1 = new EquipmentAssetMapping(physicalAsset, equipment);
        EquipmentAssetMapping mapping2 = new EquipmentAssetMapping(physicalAsset, equipmentClass);

        RoleBasedEquipment roleBasedEquipment = new RoleBasedEquipment("Role A");

        System.out.println("Equipment Properties:");
        List<EquipmentProperty> equipmentProperties = equipment.getProperties();
        for (EquipmentProperty property : equipmentProperties) {
            System.out.println(property.getName() + ": " + property.getValue());
        }
        System.out.println();
        System.out.println("Physical Asset Properties:");
        List<PhysicalAssetProperty> physicalAssetProperties = physicalAsset.getProperties();
        for (PhysicalAssetProperty property : physicalAssetProperties) {
            System.out.println(property.getName() + ": " + property.getValue());
        }
        System.out.println();
        System.out.println("Equipment Class Properties:");
        List<EquipmentClassProperty> equipmentClassProperties = equipmentClass.getClassProperties();
        for (EquipmentClassProperty classProperty : equipmentClassProperties) {
            System.out.println(classProperty.getName() + ": " + classProperty.getDescription());
        }
        System.out.println();
        System.out.println("Physical Asset Class Properties:");
        List<PhysicalAssetClassProperty> physicalAssetClassProperties = physicalAssetClass.getClassProperties();
        for (PhysicalAssetClassProperty classProperty : physicalAssetClassProperties) {
            System.out.println(classProperty.getName() + ": " + classProperty.getDescription());
        }
    }
}
