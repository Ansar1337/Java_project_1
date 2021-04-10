import type.body.VehicleTypeByBodyType;
import type.fuel.VehicleTypeByFuelType;
import type.purpose.VehicleTypeByPurpose;

public class VehicleAd {
    private final int id;

    private final String model;

    private final VehicleTypeByPurpose vehicleTypeByPurpose;

    private final VehicleTypeByBodyType vehicleTypeByBodyType;

    private final VehicleTypeByFuelType vehicleTypeByFuelType;

    public VehicleAd(
            int id,
            String model,
            VehicleTypeByPurpose vehicleTypeByPurpose,
            VehicleTypeByBodyType vehicleTypeByBodyType,
            VehicleTypeByFuelType vehicleTypeByFuelType
    ) {
        this.id = id;
        this.model = model;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyType = vehicleTypeByBodyType;
        this.vehicleTypeByFuelType = vehicleTypeByFuelType;
    }


    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public VehicleTypeByBodyType getVehicleTypeByBodyType() {
        return vehicleTypeByBodyType;
    }

    public VehicleTypeByFuelType getVehicleTypeByFuelType() {
        return vehicleTypeByFuelType;
    }

    @Override
    public String toString() {
        return model;
    }
}