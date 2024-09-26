package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {


    public static Set<String> createHashSet() {
        Set<String> hs = new HashSet<>();
        hs.add("ELEMENT KPRBC");
        hs.add("ELEMENT YPBTM");
        hs.add("ELEMENT AADXU");
        hs.add("ELEMENT RXCGJ");
        hs.add("ELEMENT WYMVD");
        hs.add("ELEMENT WFGEJ");
        hs.add("ELEMENT TYGBS");
        hs.add("ELEMENT MAPTK");
        hs.add("ELEMENT GJXVE");
        hs.add("ELEMENT BAFGL");

        return hs;
    }

    public static Set<String> createTreeSet() {
        Set<String> ts = new TreeSet<>();
        ts.add("ELEMENT KPRBC");
        ts.add("ELEMENT YPBTM");
        ts.add("ELEMENT AADXU");
        ts.add("ELEMENT RXCGJ");
        ts.add("ELEMENT WYMVD");
        ts.add("ELEMENT WFGEJ");
        ts.add("ELEMENT TYGBS");
        ts.add("ELEMENT MAPTK");
        ts.add("ELEMENT GJXVE");
        ts.add("ELEMENT BAFGL");

        return ts;
    }

    private static void printSet(Set<String> customSet) {
        for (String element : customSet) {
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {

    }

}
