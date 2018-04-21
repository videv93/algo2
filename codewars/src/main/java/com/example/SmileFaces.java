package com.example;

import java.util.List;

public class SmileFaces {
    public static String[] countSmileys(List<String> arr) {
        String joinString = String.join("", arr);
        return joinString.split("([:;][-~][)D])");
    }
}

