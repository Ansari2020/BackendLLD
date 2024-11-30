package DSA;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueNumber {
    public static void main(String[] args) {
        int arr[]={2,3,2,4,6,3,6,3};
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> i:hm.entrySet()){
            if(i.getValue()==1){
                System.out.println(i.getKey());
            }
        }
    }
}
