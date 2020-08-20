package algorithms.hackkerrank.hashmapsAndDictionaries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two strings are anagrams of each other if the letters of one string can be rearranged to
 * form the other string.
 * Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
 *
 * For example s= mom , the list of all anagrammatic pairs is [m,m] [mo,mo]
 */
public class Anagrams {


    static int sherlockAnagram(String s){
        ArrayList <String> list = new ArrayList<>();
        int len= s.length();
        int counter = 0;

        for(int i =0; i<len ; i++){
            for(int j = 1 ; j + i < len+1 ; j++ ){
                String subStr = s.substring(i, i+j);
                list.add(subStr);
            }
        }

        for(int i =0 ; i< list.size(); i++){
            String element = list.get(i);
            for(int j = i+1; j<list.size(); j++){
                if(isAnagram(element,list.get(j))){
                    counter++;
                }
            }
        }

        return counter;
    }

    private static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        char [] aChar = a.toCharArray();
        char [] bChar = b.toCharArray();

        Arrays.sort(aChar);
        Arrays.sort(bChar);

        String aSorted= new String(aChar);
        String bSorted = new String(bChar);

        return aSorted.equals(bSorted);
    }

}
