package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) result.add(e.getKey());
        }

        result.sort(new ProjectsComparator());

        return result;
    }
}
