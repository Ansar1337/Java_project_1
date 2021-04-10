package type.purpose;

public class VehicleType {
    protected String attribute;

    public VehicleType(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfType() {
        return attribute;
    }

    public String getTypeName() {
        return "Vehicle type name";
    }
}