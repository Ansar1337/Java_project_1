package type.fuel;

import type.purpose.VehicleTypeEnum;

public class ElectricType extends VehicleTypeByFuelType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}