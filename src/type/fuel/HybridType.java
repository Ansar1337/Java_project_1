package type.fuel;

import type.purpose.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuelType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}