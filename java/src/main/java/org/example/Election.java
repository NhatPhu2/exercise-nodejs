package org.example;

import java.util.HashMap;
import java.util.Map;

public class Election {
    HashMap<String, Integer> candidates = new HashMap<>();

    public void vote(String name) {
        if (!candidates.containsKey(name))
            candidates.put(name, 1);
        else
            candidates.put(name, candidates.get(name) + 1);
    }

    public String winner() {
        Map.Entry<String, Integer> entryWithMaxValue = null;
        String winner = "";
        for (Map.Entry<String, Integer> set : candidates.entrySet()) {
            if (
                    entryWithMaxValue == null || set.getValue() > entryWithMaxValue.getValue()
            ) {
                entryWithMaxValue = set;
                winner = set.getKey() + " " + set.getValue();
            }
        }
        return winner;
    }
}
