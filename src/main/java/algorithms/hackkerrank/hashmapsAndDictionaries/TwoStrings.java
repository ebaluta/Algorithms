package algorithms.hackkerrank.hashmapsAndDictionaries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**Given two strings, determine if they share a common substring.
 * A substring may be as small as one character.
 * For example, the words "a", "and", "art" share the common substring.
 * The words "be" and "cat" do not share a substring.
 *
 */
public class TwoStrings {

    public static String twoStrings(String s1, String s2){
        Map<String,Integer> s1Map = new HashMap<>();
        Map<String, Integer> s2Map = new HashMap<>();

        for(String s1Str : s1.split("")){
            s1Map.put(s1Str,1);
        }

        for (String s2Str: s2.split("")){
            s2Map.put(s2Str,1);
        }

        for(Map.Entry<String,Integer> entry : s1Map.entrySet()){
            if(s2Map.containsKey(entry.getKey())){
                return "Yes";
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("Anna", "blbl"));
    }
}
