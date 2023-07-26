package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            int wordLength = e.getKey().length();

            if (result.containsKey(wordLength)) {
                result.get(wordLength).add(e.getKey());
            } else {
                Set<String> wordsSet = new HashSet<>();
                wordsSet.add(e.getKey());
                result.put(wordLength, wordsSet);
            }
        }

        return result;
    }
}
