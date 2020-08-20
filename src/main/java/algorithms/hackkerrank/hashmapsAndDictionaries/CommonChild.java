package algorithms.hackkerrank.hashmapsAndDictionaries;

public class CommonChild {
    //HARRY, SALLY

    public static int commonChild(String s1, String s2){
        String [] s1Arr = s1.split("");
        int max = 0;


        for(int i =0 ; i < s1.length() ; i ++){
            String sub = s1Arr[i]; // H
            if(!s2.contains(sub)){
                break;
            }

            int index = s2.indexOf(sub);

        }

        return max;
    }
}
