package org.example.mineral;

public enum Components {
    Carbon, Silicon, Oxygen, Hydrogen,
    Sodium, Calcium, Uranium, MoonDust, GammaPart, Mistake;

    public static String toString(Components[] cmp) {
        String s = "";
        for(Components c : cmp) {
            s += c;
            s += " ";
        }
        return s;
    }

    public static Object hashCode(Components[] cmp) {

        return null;
    }
}
