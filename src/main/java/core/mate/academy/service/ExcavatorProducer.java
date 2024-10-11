package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        Excavator thirdExcavator = new Excavator();
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
