package org.example.mineral;

public final class MoonStone extends Mineral {

    {
        name = "MoonStone";
    }

    @Override
    public String toString() {
        return "MoonStone is a mysterious mineral named for its soft, shimmering radiance, "+
                "reminiscent of the light of the full moon. In fact, the \"moonstone\" is a "+
                "type of feldspar (orthoclase or adulyar), \nwhich has a "+
                "effect: when the stone is rotated, the illusion of a smooth movement of the inner light is created.";
    }

    Components[] cmp = new Components[3];

    {
        cmp[0] = Components.GammaPart;
        cmp[1] = Components.MoonDust;
        cmp[2] = Components.Uranium;
    }

    @Override
    public double getTemp(){
        temp = Math.random() * 100;
        return temp;
    }

    @Override
    public boolean getSinkable(){
        sinkable = ((int)(Math.random())) == 1;
        return sinkable;
    }

    @Override
    public boolean getBurnable(){
        burnable = ((int)(Math.random())) == 1;
        return burnable;
    }

    @Override
    public boolean getDecompos(double temp){
        return temp >= (double) 50;
    }

    public Components[] getComponents(){
        return cmp;
    }

    @Override
    public void Describe(){

    }
}
