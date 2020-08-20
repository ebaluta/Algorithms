package algorithms.hackkerrank.hashmapsAndDictionaries;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FrequencieQueries {

    static List<Integer> freqQuery(List<List<Integer>> queries){
        Map<Integer,Integer> outputMap = new HashMap<>();
        List <Integer> outputList = new LinkedList<>();
        for (List<Integer> list : queries){
            switch (list.get(0)){
                case 1:
                    Integer count = outputMap.get(list.get(1));
                    if(count == null){
                        outputMap.put(list.get(1),1);
                    } else {
                        count++;
                        outputMap.put(list.get(1), count);
                    }
                    break;
                case 2:
                    if(outputMap.containsKey(list.get(1))){
                        Integer amount = outputMap.get(list.get(1));
                        amount--;
                        outputMap.put(list.get(1),amount);
                    }
                    break;
                case 3:
                    if(outputMap.containsValue(list.get(1))){
                        outputList.add(1);
                    } else outputList.add(0);
                    break;
            }
        }

        return outputList;
    }

    public static void main(String[] args) {
        List <Integer> one = new LinkedList<>();
        one.add(1);
        one.add(5);

        List <Integer> two = new LinkedList<>();
        two.add(1);
        two.add(6);

        List <Integer> three = new LinkedList<>();
        three.add(3);
        three.add(3);

        List <Integer> four = new LinkedList<>();
        four.add(1);
        four.add(10);

        List<Integer> five = new LinkedList<>();
        five.add(1);
        five.add(10);

        List<Integer> six = new LinkedList<>();
        six.add(1);
        six.add(6);

        List<Integer> seven = new LinkedList<>();
        seven.add(2);
        seven.add(5);

        List <Integer> eight = new LinkedList<>();
        eight.add(3);
        eight.add(2);

        List<List<Integer>> overallList = new LinkedList<>();
        overallList.add(one);
        overallList.add(two);
        overallList.add(three);
        overallList.add(four);
        overallList.add(five);
        overallList.add(six);
        overallList.add(seven);
        overallList.add(eight);

        List <Integer> inst= freqQuery(overallList);


    }
}
