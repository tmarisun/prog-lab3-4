package org.example;
import org.example.Scene;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Scene scene = new Scene();
        try {
            scene.start();
        }
        catch (NuclearDangerException e) {
            System.out.println(e.getMessage());
        }
    }
}
