package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        Truck thirdTruck = new Truck();
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
