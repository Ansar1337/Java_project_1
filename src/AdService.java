import type.body.VehicleTypeByBodyType;
import type.fuel.VehicleTypeByFuelType;
import type.purpose.VehicleTypeByPurpose;

public class AdService {
    private VehicleAd[] ads;

    public void filterByPurpose(VehicleTypeByPurpose vehicleType) {
        for (VehicleAd ad : ads) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто" +
                        " - " + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " +
                        vehicleType.getTypeName() + ", критерий- " + vehicleType.getAttributeOfType() + ", так как " +
                        "имеет тип авто " + ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByBody(VehicleTypeByBodyType vehicleType) {
        for (VehicleAd ad : ads) {
            if (ad.getVehicleTypeByBodyType().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто" +
                        " - " + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " +
                        vehicleType.getTypeName() + ", критерий- " + vehicleType.getAttributeOfType() + ", так как " +
                        "имеет тип авто " + ad.getVehicleTypeByBodyType().getTypeName());
            }
        }
    }

    public void filterByFuel(VehicleTypeByFuelType vehicleType) {
        for (VehicleAd ad : ads) {
            if (ad.getVehicleTypeByFuelType().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто" +
                        " - " + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " +
                        vehicleType.getTypeName() + ", критерий- " + vehicleType.getAttributeOfType() + ", так как " +
                        "имеет тип авто " + ad.getVehicleTypeByFuelType().getTypeName());
            }
        }
    }

    public void setAds(VehicleAd[] ads) {
        this.ads = ads;
    }
}