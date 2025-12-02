package org.example.experiments;
import org.example.mineral.Mineral;
import org.example.mineral.Components;

public interface Experementer {

    public String burnTest(Mineral mineral);
    public String sinkTest(Mineral mineral);
    public String energyTest(Mineral mineral);
    public Components[] decomposeTest(Mineral mineral) throws NoDecomposeException;
    public double tempTest(Mineral mineral);


}
