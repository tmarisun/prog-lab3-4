package org.example.mineral;

import java.util.Objects;

public abstract class Mineral {

    protected double temp;
    protected boolean sinkable;
    protected boolean burnable;
    protected double decomposable;
    protected Components[] cmp;
    public String name;

    public abstract double getTemp();
    public abstract boolean getDecompos(double temp);
    public abstract boolean getSinkable();
    public abstract boolean getBurnable();
    public abstract Components[] getComponents();
    public abstract void Describe();


    @Override
    public int hashCode() {
        return Objects.hash(temp, burnable, sinkable, decomposable, Components.hashCode(cmp));
    }


}
