package org.example.experiments;
import org.example.mineral.Mineral;
import org.example.mineral.Components;

public class Znaika implements Experementer {

    @Override
    public String burnTest(Mineral mineral) {
        boolean x = mineral.getBurnable();
        if(x){
            return "Burnable";
        }
        else{
            return "Not Burnable";
        }
    }

    @Override
    public String sinkTest(Mineral mineral) {
        boolean x = mineral.getBurnable();
        if(x){
            return "Sinkable";
        }
        else{
            return "Not Sinkable";
        }
    }

    @Override
    public String energyTest(Mineral mineral) {
        double x = mineral.getTemp();
        if(x >= (double)30){
            return "Thermal energy";
        }
        else{
            return "Radiant energy";
        }
    }

    @Override
    public Components[] decomposeTest(Mineral mineral) throws NoDecomposeException {
        boolean x = mineral.getDecompos(mineral.getTemp());
        if(x){
            return mineral.getComponents();
        }
        else{
            throw new NoDecomposeException("No Decomposed");
        }
    }

    @Override
    public double tempTest(Mineral mineral) {
        double x = mineral.getTemp();
        return x;
    }



}
