package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> pair : projects.entrySet()) {
            String projectName = pair.getKey();
            Set<String> developers = pair.getValue();

            if (developers.contains(developer)) {
                list.add(projectName);
            }
        }

        list.sort((o1, o2) -> {
            Integer l1 = o1.length();
            Integer l2 = o2.length();

            if (l1.equals(l2)) {
                return o2.compareTo(o1);
            } else {
                return l2.compareTo(l1);
            }
        });

        return list;
    }
}
