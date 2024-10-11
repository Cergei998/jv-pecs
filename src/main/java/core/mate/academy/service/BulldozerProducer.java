package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        Bulldozer secondBulldozer = new Bulldozer();
        Bulldozer thirdBulldozer = new Bulldozer();
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
