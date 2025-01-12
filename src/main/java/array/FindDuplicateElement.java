package array;

import  java.util.*;

public class FindDuplicateElement {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int j : arr) {
            // for(int j=i+1;j<arr.length;j++){
            //     if(arr[i]==arr[j] & !list.contains(arr[i])){
            //         list.add(arr[i]);
            //         break;
            //     }

            // }
            map.put(j, map.getOrDefault(j, 0) + 1);

        }

        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>1){
                list.add(m.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4,4,5};
         List<Integer> l=new FindDuplicateElement().findDuplicates(a);
         System.out.println(l);
    }
}
