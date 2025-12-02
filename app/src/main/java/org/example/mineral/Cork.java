package org.example.mineral;

public final class Cork extends Mineral {

    {
        name = "Cork";
    }

    @Override
    public String toString() {
        return "Cork is a light, porous material of organic origin, " +
                "obtained from the bark of the cork oak (Quercus suber).\nDespite the fact " +
                "that cork is not a real mineral, in the framework of the experiment it is considered " +
                "a conditional \"mineral\" because of its stable physical properties.";
    }

    Components[] cmp =  new Components[3];

    {
        cmp[0] = Components.Sodium;
        cmp[1] = Components.Calcium;
        cmp[2] = Components.Carbon;
    }

    @Override
    public double getTemp(){
        temp = 15.0;
        return temp;
    }

    @Override
    public boolean getSinkable(){
        sinkable = true;
        return sinkable;
    }

    @Override
    public boolean getBurnable(){
        burnable = true;
        return burnable;
    }

    @Override
    public boolean getDecompos(double temp){
        return true;
    }

    public Components[] getComponents(){
        return cmp;
    }

    @Override
    public void Describe(){

    }
}
