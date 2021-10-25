package Laborator05.TaskHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        Map<String, String> hmCountry = new HashMap<>();

        hmCountry.put("RO","Romania");
        hmCountry.put("FR","France");
        hmCountry.put("GB","Great Britain");
        hmCountry.put("DE","Germany");
        hmCountry.put("GR","Greece");
        hmCountry.put("NL","Netherlands");
        hmCountry.put("PL","Poland");
        hmCountry.put("HU", "Hungary");
        hmCountry.put("ES","Spain");
        hmCountry.put("IT","Italy");

        System.out.println(hmCountry);
        hmCountry.remove("GB");
        System.out.println(hmCountry);


        System.out.println("\nDisplay in alphabetically order: ");
        hmCountry.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
