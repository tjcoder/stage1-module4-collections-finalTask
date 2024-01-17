package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String s : sourceMap.keySet()) {
            int l = s.length();
            Set<String> set;
            if (!map.containsKey(l)) {
                set = new HashSet<>();
            } else {
                set = map.get(l);
            }
            set.add(s);
            map.put(l, set);
        }

        return map;
    }
}
