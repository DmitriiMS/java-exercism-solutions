import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> ranked = new ArrayList<>();
        if (prc1.getNumberOfVictories() <= prc2.getNumberOfVictories()) {
            ranked.add(prc1);
            ranked.add(prc2);
        } else {
            ranked.add(prc2);
            ranked.add(prc1);
        }

        return ranked;
    }
}
