package type.body;

import type.purpose.VehicleTypeEnum;

public class BusType extends VehicleTypeByBodyType {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}