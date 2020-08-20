package algorithms.hackkerrank.hashmapsAndDictionaries;

import java.util.*;

public class HashTable {

    public static void checkMagazine(String[] magazine, String[] note) {
        List<String> magazineList = new ArrayList<>(Arrays.asList(magazine));
        List<String> noteList = new ArrayList<>(Arrays.asList(note));
        String toPrint = "";

        for (String noteStr : noteList) {
            if (!magazineList.contains(noteStr)) {
                toPrint = "No";
                break;
            } else magazineList.remove(noteStr);
        }

        System.out.println(toPrint.equals("No") ? "No" : "Yes");
    }

    public static void checkMagazine2(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        for (String magazineStr : magazine) {
            Integer i = magazineMap.get(magazineStr);

            if (i == null) {
                magazineMap.put(magazineStr, 1);
            } else {
                magazineMap.put(magazineStr, i + 1);
            }
        }

        for (String noteStr : note) {
            Integer i = noteMap.get(noteStr);
            if (i == null) {
                noteMap.put(noteStr, 1);
            } else {
                noteMap.put(noteStr, i + 1);
            }
        }

        String toPrint = "";

        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            Integer i = magazineMap.get(entry.getKey());
            if (i == null) {
                toPrint = "No";
                break;
            } else {
                if (i < entry.getValue()) {
                    toPrint = "No";
                    break;
                }
            }
        }
        System.out.println(toPrint.equals("No") ? "No" : "Yes");
    }

    public static void main(String[] args) {
        String[] magazine = new String[]{"two", "times", "three", "is", "not", "four"};
        String[] note = new String[]{"two", "times", "two", "is", "four"};
        checkMagazine2(magazine, note);
    }

}
