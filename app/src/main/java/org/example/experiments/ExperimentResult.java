package org.example.experiments;

import org.example.mineral.Components;

public record ExperimentResult(
        String burnTest,
        String sinkTest,
        String energyTest,
        Components[] cmp,
        double tempTest

) {
    @Override
    public String toString() {
        return """
            Results:
            Burn test: %s
            Sink test: %s
            Temp test: %.1f°C
            Energy test: %s
            Decompose: %s
            """.formatted(burnTest, sinkTest, tempTest, energyTest, Components.toString(cmp));
    }

}
