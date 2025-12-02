package org.example;

public class Main {
    void main() {
        Scene scene = new Scene();
        try {
            scene.start();
        }
        catch (NuclearDangerException e) {
            System.out.println(e.getMessage());
        }
    }
}
