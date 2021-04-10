package type.body;

import type.purpose.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}