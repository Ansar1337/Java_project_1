package type.body;

import type.purpose.VehicleTypeEnum;

public class PickupType extends VehicleTypeByBodyType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}