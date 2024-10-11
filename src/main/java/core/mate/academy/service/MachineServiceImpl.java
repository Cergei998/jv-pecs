package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozer = new BulldozerProducer();
            return new ArrayList<>(bulldozer.get());
        }
        if (type.equals(Excavator.class)) {
            ExcavatorProducer excavator = new ExcavatorProducer();
            return new ArrayList<>(excavator.get());
        }
        if (type.equals(Truck.class)) {
            TruckProducer truck = new TruckProducer();
            return new ArrayList<>(truck.get());
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}
