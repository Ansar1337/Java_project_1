import type.body.PickupType;
import type.body.SedanType;
import type.fuel.DieselType;
import type.fuel.PetrolType;
import type.purpose.*;

public class Main {

    public static void main(String[] args) {
        AdService adService = new AdService();
        VehicleAd ad1 = new VehicleAd(123, "Volvo", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd ad2 = new VehicleAd(45, "Kamaz", new TruckType(), new PickupType(), new DieselType());
        VehicleAd ad3 = new VehicleAd(77, "", new CarType(), new SedanType(), new DieselType());

        adService.setAds(new VehicleAd[]{
                ad1, ad2, ad3
        });

        adService.filterByPurpose(new PassengerType());
        adService.filterByPurpose(new TruckType());
        adService.filterByFuel(new PetrolType());
    }
}