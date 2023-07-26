package com.epam.mjc.collections.combined;

import java.util.Comparator;

public class ProjectsComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
            return o2.compareTo(o1);
        }
        return o2.length() - o1.length();
    }
}