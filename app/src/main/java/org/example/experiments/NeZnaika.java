package org.example.experiments;

import org.example.mineral.Components;
import org.example.mineral.Mineral;

public class NeZnaika implements Experementer{

    @Override
    public String burnTest(Mineral mineral) {
        return "SOS, NeZnaika burned down!";
    }

    @Override
    public String sinkTest(Mineral mineral) {
        return "SOS, NeZnaika sinked down!";
    }

    @Override
    public String energyTest(Mineral mineral) {
        return "SOS, NeZnaika was irradiated!";
    }

    @Override
    public Components[] decomposeTest(Mineral mineral){
        Components[] cmp = new Components[3];
        cmp[0] = Components.Mistake;
        cmp[1] = Components.Mistake;
        cmp[2] = Components.Mistake;
        return cmp;
    }

    @Override
    public double tempTest(Mineral mineral) {
        return -100;
    }
}
