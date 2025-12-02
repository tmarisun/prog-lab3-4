package org.example.mineral;

public final class SugarPiece extends Mineral {

    {
        name = "SugarPiece";
    }

    @Override
    public String toString() {
        return "SugarPiece is a crystalline substance of organic origin, " +
                "consisting mainly of sucrose (a disaccharide formed by glucose and fructose).\n" +
                "Although sugar is not a mineral in the geological sense, in the framework of the experiment " +
                "it is considered as a conditional \"mineral\" because of its stable shape and predictable " +
                "physico-chemical properties.";
    }

    Components[] cmp =  new Components[3];

    {
        cmp[0] = Components.Carbon;
        cmp[1] = Components.Oxygen;
        cmp[2] = Components.Hydrogen;
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
